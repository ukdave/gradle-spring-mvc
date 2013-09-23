package com.test.service;

import java.util.Random;

import org.springframework.stereotype.Service;

/**
 * Greeting service.
 *
 * @author David
 */
@Service
public class GreetingService {
	
	/** List of greetings. */
	private static final String[] 	GREETINGS 	= { "Hello", "Bonjour", "Oh Hai" };

	/** Random number generator. */
	private static final Random 	RND 		= new Random(System.currentTimeMillis());

	/**
	 * Returns a random greeting.
	 *
	 * @return a greeting
	 */
	public String randomGreeting() {
		return GREETINGS[RND.nextInt(GREETINGS.length)];
	}
}