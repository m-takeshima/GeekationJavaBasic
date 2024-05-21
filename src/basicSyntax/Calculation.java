package basicSyntax;

public class Calculation {

	public static void main(String[] args) {
		//実装内容１
		int x = 5;
		int y = 10;
		int z = x + y;
			
		System.out.println("変数zの値は" + z + "です");
		
		//実装内容２
		double a = 5.25;
		int b =  (int)((a + 2.5)* 3.0 )+ 10;
		
		System.out.println("変数aの値は" + (a + 2.5) * 3.0 + "です");
		System.out.println("変数bの値は" + b + "です");
		

	}

}
