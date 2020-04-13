
public class Calculator {
	private double operandOne;
	private char operation;
	private double operandTwo;
	
	public Calculator() {
	}
	
	public Calculator(double operandOne, char operation, double operandTwo) {
		this.operandOne = operandOne;
		this.operation = operation;
		this.operandTwo = operandTwo;
	}
	
	public double performOperation() {
		double result = 0;
		if(operation == '+') {
			result = operandOne + operandTwo;			
		}
		else if(operation == '-') {
			result = operandOne - operandTwo;
		}
		return result;		
	}
	
	public double getResults() {
		return performOperation();
	}
	
	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	
	public char getOperation() {
		return operation;
	}
	
	public void setOperation(char operation) {
		this.operation = operation;
	}
	
	public double getOperandTwo() {
		return operandTwo;
	}
	
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
}
