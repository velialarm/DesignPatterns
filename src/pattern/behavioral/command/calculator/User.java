package pattern.behavioral.command.calculator;

import java.util.ArrayList;
import java.util.List;

public class User {

	private Calculator calculator = new Calculator();
    private List<Command> commands = new ArrayList<>();
    private int current;
    
    public void Redo(int levels){
    	
    }
    
    public void Undo(int levels){
    	
    }
    
    public void Compute(String operator, int operand){
    	
    }
}
