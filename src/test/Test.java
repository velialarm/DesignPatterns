package test;

import pattern.behavioral.memento.ProspectMemory;
import pattern.behavioral.memento.SalesProspect;

public class Test {

	public static void main(String[] args) {
		
//CHAIN OF RESPONSIBILITY PATTERN	
		/*
		Approver teamLead = new TeamLead();
		Approver vp = new VicePresident();
		Approver ceo = new President();

		teamLead.setSuccessor(vp);
		vp.setSuccessor(ceo);

		Purchase purchase = new Purchase(2034, 350.00);
		teamLead.processRequest(purchase);

		purchase = new Purchase(2035, 32590.10);
		teamLead.processRequest(purchase);

		purchase = new Purchase(2036, 122100.00);
		teamLead.processRequest(purchase);
		 */	
		
// COMMAND PATTERN
		/*
		RemoteControl control = new RemoteControl();
		Light light = new Light();
		
		Command lightsOn = new LightOnCommand(light);
		Command lightsOff = new LightOffCommand(light);
		
		//switch on
		control.setCommand(lightsOn);
		control.pressButton();
		
		//switch off
		control.setCommand(lightsOff);
		control.pressButton();
		*/
		
		
//STRATEGY PATTERN
		/*
		CompressionContext ctx = new CompressionContext();
		ctx.setStrategy(new ZipCompressionStrategy());
		//get a list of files
		
		List<File> fileList = new ArrayList<>();
		ctx.createArchive(fileList );
		*/
		
//OBSERVER PATTERN
		// Create IBM stock and attach investors
		/*
        IBM ibm = new IBM("IBM", 120.00);
        ibm.Attach(new Investor("Sorros"));
        ibm.Attach(new Investor("Berkshire"));

        // Fluctuating prices will notify investors
        ibm.setPrice(120.10); 
        ibm.setPrice(121.00); 
        ibm.setPrice(120.50); 
        ibm.setPrice(120.75); 
		*/
		
//MEDIATOR PATTERN
		/*
		ChatRoom chatRoom = new ChatRoom();

        Participant george = new Beetle("George");
        Participant paul = new Beetle("Paul");
        Participant ringo = new Beetle("Ringo");
        Participant john = new Beetle("John");
        Participant yoko = new NonBeetle("Yoko");

        chatRoom.Register(george);
        chatRoom.Register(paul);
        chatRoom.Register(ringo);
        chatRoom.Register(john);
        chatRoom.Register(yoko);

        yoko.send("John", "Hi John!");
        paul.send("Ringo", "All you need is love");
        ringo.send("George", "My sweet Lord");
        paul.send("John", "Can't buy me love");
        john.send("Yoko", "My sweet love");
        */
		
//MOMENTO PATTERN
		/*
		SalesProspect sale = new SalesProspect( );
		sale.setName("Noel van Halen");
		sale.setPhone("(412) 256-0990");
		sale.setBudget(25000.0);

        // Store internal state
        ProspectMemory memory = new ProspectMemory();
        memory.setMemento(sale.saveMemento());

        // Continue changing originator
        sale.setName( "Leo Welch");
        sale.setPhone("(310) 209-7111");
        sale.setBudget(1000000.0);

        // Restore saved state
        sale.restoreMemento(memory.getMemento());
		*/
		
		
	}
}
