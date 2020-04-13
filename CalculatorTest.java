
public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc1 = new Calculator(10.5,'-',3.5);
		System.out.println(calc1.getResults());
		
		Calculator calc2 = new Calculator(10.0,'+',5.0);
		System.out.println(calc2.getResults());
	}
}
