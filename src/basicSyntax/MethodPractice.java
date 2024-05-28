package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		
		calcAns(a, b);

	}
	
	public static void addition(int a, int b) {
		int ans = a + b;
		
		System.out.println("計算結果は" + ans + "です。");
				
		return;

	}
	
	public static void subtraction(int a, int b) {
		int ans = a - b;
		
		System.out.println("計算結果は" + ans + "です。");
				
		return;

	}
	
	public static void multiplication(int a, int b) {
		int ans = a * b;
		
		System.out.println("計算結果は" + ans + "です。");
				
		return;

	}
	
	public static void division(int a, int b) {
		int ans = a / b;
		
		System.out.println("計算結果は" + ans + "です。");
				
		return;

	}
	
	public static void calcAns(int a, int b) {
		
		addition(a, b);
		subtraction(a,b);
		multiplication(a,b);
		division(a,b);
		
		return;

	}
}
