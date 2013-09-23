package com.test.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import com.test.service.GreetingService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

/**
 * Unit tests for the {@link HomeController} class.
 *
 * Note: Serice mocks need to be defined in src/test/resources/app-config.xml.
 *
 * @author David
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:app-config.xml", "file:src/main/webapp/WEB-INF/spring/mvc-config.xml" })
public class HomeControllerTests {

	/** The web application context. */
	@Autowired
	private WebApplicationContext 	wac;

	/** The mock MVC. */
	private MockMvc 				mockMvc;

	/** The greeting service. */
	@Autowired
	private GreetingService 		greetingService;

	/**
	 * Sets up the test.
	 */
	@Before
	public void setup() {
		mockMvc = webAppContextSetup(wac).build();
	}

	/**
	 * Tests /home.
	 */
	@Test
	public void testMain() throws Exception {
		mockMvc
			.perform(get("/home")
				.accept(MediaType.TEXT_HTML))
  			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(view().name("home/index"));
	}

	/**
	 * Tests /home.
	 */
	@Test
	public void testSayHello() throws Exception {
		when(greetingService.randomGreeting()).thenReturn("Hello");
		
		mockMvc
			.perform(post("/home")
				.accept(MediaType.TEXT_HTML)
				.contentType(MediaType.APPLICATION_FORM_URLENCODED)
				.param("name", "bob"))
  			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(model().attributeExists("greeting"))
			.andExpect(model().attribute("name", is("bob")))
			.andExpect(view().name("home/hello"));
		
		verify(greetingService).randomGreeting();
	}
}