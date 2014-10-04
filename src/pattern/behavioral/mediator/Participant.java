package pattern.behavioral.mediator;

public class Participant {

	private String name;
    private ChatRoom chatRoom;
    
	public Participant(String name) {
		this.name = name;
	}

	public void send(String to, String message){
		this.chatRoom.Send(this.name, to, message);
	}
	public void recieve(String from,String message){
		System.out.printf("%s to %s:  %s ", from, this.name, message);
	}
	public ChatRoom getChatRoom() {
		return chatRoom;
	}

	public void setChatRoom(ChatRoom chatRoom) {
		this.chatRoom = chatRoom;
	}

	public String getName() {
		return name;
	}
    
	
}
