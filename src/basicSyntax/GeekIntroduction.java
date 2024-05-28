package basicSyntax;

public class GeekIntroduction {
	int age = 0;
	double height = 0;
	int num1 = 0;
	int num2 = 0;

	public static void Greeting(int age, double height) {
		
		System.out.println("こんにちわ！私はGeek君でごわす。");
		System.out.println("年は" + age + "でごわす。");
		System.out.println("身長は" + height + "でごわす。");
		
		}
	
	public static void specialSkill(int num1, int num2) {
	
		if (num1 > num2) {
			System.out.println("num2はnum1より大きい値にしてください。");
			return;
		}
		if (num1 > 300 || num2 > 300) {
			System.out.println("num1とnum2は300以下にしてください。");
		}
		
		int i = num1;
		
		while (i <= num2) {
			if (i % 15 == 0) {
				System.out.println(num1 + "は３の倍数かつ５の倍数です。");
			} else if (i % 3 == 0) {
				System.out.println(i + "は３の倍数です");
			} else if (i % 5 == 0) {
				System.out.println(i + "は５の倍数です。");
			} else {
				System.out.println(i);
			}
			i++;
			
		}
		
		}
}