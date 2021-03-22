package Calculator;

class Calculator implements java.io.Serializable {
	private double num1;
	private double num2;
	private double result;
	private char c;
	
	
	public Calculator() {

	}
		
		public void performOperation() {
			char c = this.getOperator();
			if(c == '+') {
				result = num1 + num2;
			}
			else if(c == '-'){
				result = num2 - num2;
			}
		}
		
		public void getResults() {
			System.out.println(result);
			
			
		}
	


	public double getNum1() {
		return num1;
	}


	public void setNum1(double num1) {
		this.num1 = num1;
	}


	public double getNum2() {
		return num2;
	}


	public void setNum2(double num2) {
		this.num2 = num2;
	}


	public double getResult() {
		return result;
	}


	public void setResult(double result) {
		this.result = result;
	}


	public char getOperator() {
		return c;
	}


	public void setOperator(char operator) {
		this.c = operator;
	}
}
