package pattern.behavioral.iterrator;

import java.util.List;

public class ConcreteTV {
	private ChannelIterator iterator;
	private List<String> channels;
	
	public ConcreteTV() {
		iterator = new ConcreteChannelIterator(channels);
	}

	public ChannelIterator getIterator() {
		return iterator;
	}
	
}
