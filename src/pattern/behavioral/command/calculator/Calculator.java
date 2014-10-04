package pattern.behavioral.command.calculator;

public class Calculator {

	@SuppressWarnings("unused")
	private int currentValue;
	public void operation(String operator, int operand) {
		switch (operator) {
		case "plus":
			this.currentValue+=operand;
			break;

		case "minus":
			this.currentValue-=operand;
			break;
		default:
			break;
		}
	}

}
