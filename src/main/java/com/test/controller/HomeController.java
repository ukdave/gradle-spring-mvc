package com.test.controller;

import com.test.service.GreetingService;

import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Home controller.
 *
 * @author David
 */
@Controller
@RequestMapping("home")
public class HomeController {

	/** The greeting service. */
	private final GreetingService 	greetingService;

	/**
	 * Instantiates a new home controller.
	 *
	 * @param greetingService the greeting service
	 */
	@Autowired
	public HomeController(final GreetingService greetingService) {
		this.greetingService = Validate.notNull(greetingService, "greetingService must not be null");
	}

	/**
	 * Default handler.
	 *
	 * @param model the model
	 * @return a view name
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String main() {
		return "home/index";
	}

	/**
	 * Say hello handler.
	 *
	 * @param model the model
	 * @param name the name
	 * @return a view name
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String sayHello(final Model model, @RequestParam("name") final String name) {
		model.addAttribute("greeting", greetingService.randomGreeting());
		model.addAttribute("name", name);
		return "home/hello";
	}
}
