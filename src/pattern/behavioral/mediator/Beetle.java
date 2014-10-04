package pattern.behavioral.mediator;

public class Beetle extends Participant {

	public Beetle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void recieve(String from, String message) {
		System.out.println("\nTo a Beetle: ");
		super.recieve(from, message);
	}

}
