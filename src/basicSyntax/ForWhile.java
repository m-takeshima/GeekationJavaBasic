package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
		//実装内容１		
		int num = 1;
		
		while (num <= 100) {
			if (num % 3 == 0) {
				System.out.println("Fizz");
			}
			if (num % 5 == 0) {
				System.out.println("Buzz");
			}
			if (num % 5 == 0 || num % 3 == 0) {
				System.out.println("FizzBuzz");
			}
			
			num ++;
		}
		
		//実装内容２
		String[] words = {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};
		
		for (String word:words) {
			if (word == "Java") {
				System.out.println("現在学習中の言語はJavaです。");
				
				continue;
			}
			if (word == "HTML") {
				System.out.println("HTMLはプログラミング言語ではありません。");
				
				break;
			}
			System.out.println(word);
		}
	}
}
