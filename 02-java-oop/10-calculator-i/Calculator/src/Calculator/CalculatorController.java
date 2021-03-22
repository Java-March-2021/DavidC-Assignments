package Calculator;

public class CalculatorController {
public static void main (String[] args) {
	Calculator calc = new Calculator();
	
	calc.setNum1(10.5);
	calc.setNum2(5.2);
	calc.setOperator('+');
	calc.performOperation();
	calc.getResults();
}
}
