package pattern.creational.prototype;

public class Color extends ColorPrototype {

	private int red;
	private int greeen;
	private int blue;
	
	public Color(int red, int greeen, int blue) {
		this.red = red;
		this.greeen = greeen;
		this.blue = blue;
	}
	
	@Override
	public ColorPrototype cloneMe() {
		return null;
	}
}
