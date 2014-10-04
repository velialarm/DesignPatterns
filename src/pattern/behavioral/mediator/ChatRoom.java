package pattern.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class ChatRoom extends AbstractChatRoom {

	private Map<String,Participant> participants = new HashMap<String, Participant>();
	
	@Override
	public void Register(Participant participant) {

		if (!this.participants.containsValue(participant))
        {
            participants.put(participant.getName(), participant);
        }

        participant.setChatRoom(this);
	}

	@Override
	public void Send(String from, String to, String message) {
		Participant participant = this.participants.get(to);

        if (participant != null)
        {
            participant.recieve(from, message);
        }
	}

}
