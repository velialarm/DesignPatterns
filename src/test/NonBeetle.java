package test;

import pattern.behavioral.mediator.Participant;

public class NonBeetle extends Participant {

	public NonBeetle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void recieve(String from, String message) {
		System.out.println("\nTo a NonBeetle: ");
		super.recieve(from, message);
	}

}
