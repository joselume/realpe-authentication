package com.github.joselume;

import static org.junit.Assert.*;

import org.junit.Test;

public class ApplicationTest {

	 
	private Application myApplication = new Application();
	
	@Test
	public void whenOpenApplicationReturnOpeningMessage() {
		// act
		String response = myApplication.open();
		// assert
		assertTrue(response.length() > 0);
	}
	@Test
	public void whenCloseApplicationReturnClosingMessage() {
		// act
		String response = myApplication.close();
		// assert
		assertTrue(response.length() > 0);
	}

}
