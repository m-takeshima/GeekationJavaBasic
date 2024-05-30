package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 6;
		int b = 3;
		
		calcAns(a, b);

	}
	
	public static int addition(int a, int b) {
		int ans = a + b;
		
		System.out.println("計算結果は" + ans + "です。");
		
		return ans;
		
	}
	
	public static int subtraction(int a, int b) {
		int ans = a - b;
		
		System.out.println("計算結果は" + ans + "です。");
		
		return ans;
				
	}
	
	public static int multiplication(int a, int b) {
		int ans = a * b;
		
		System.out.println("計算結果は" + ans + "です。");
		
		return ans;		
				
	}
	
	public static int division(int a, int b) {
		int ans = a / b;
		
		System.out.println("計算結果は" + ans + "です。");
		
		return ans;
		
	}
	
	public static void calcAns(int a, int b) {
		
		addition(a, b);
		subtraction(a,b);
		multiplication(a,b);
		division(a,b);

	}
}
