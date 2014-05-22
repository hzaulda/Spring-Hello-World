package com.example;

public class HelloMessageFrench implements HelloMessage {

	private String message;
	
	
	public HelloMessageFrench(String message) {
		super();
		this.message = message;
	}


	@Override
	public String getMessage() {
		return "Bonjour tout le monde!";
	}

}
