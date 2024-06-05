package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 6;
		int b = 3;
		
		int addResult = addition(a,b);
		int subResult = subtraction(a,b);
		int multiResult = multiplication(a,b);
		int divResult = division(a,b);
		
		printResult(addResult);
		printResult(subResult);
		printResult(multiResult);
		printResult(divResult);

	}
	
	public static int addition(int a, int b) {
		return a + b;
		
	}
	
	public static int subtraction(int a, int b) {
		return a - b;
				
	}
	
	public static int multiplication(int a, int b) {
		return a * b;	
				
	}
	
	public static int division(int a, int b) {
		return a / b;
		
	}
	
	public static void printResult(int result) {
		
		System.out.println("計算結果は" + result + "です。");

	}
}
