package pattern.behavioral.command.calculator;

public class CalculatorCommand extends Command {

	private Calculator calculator;
	private String operator;
	private int operand;
	
	
	public CalculatorCommand(Calculator calculator, String operator, int operand) {
		this.calculator = calculator;
		this.operator = operator;
		this.operand = operand;
	}

	@Override
	public void Execute() {
		this.calculator.operation(this.operator,this.operand);
	}

	@Override
	public void UnExecute() {
		this.calculator.operation(undo(this.operator),this.operand);
	}

	private String undo(String operator2) {
		switch (operator2) {
		case "plus":
			
			return "minus";

		default:
			break;
		}
		return "";
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public void setOperand(int operand) {
		this.operand = operand;
	}

}
