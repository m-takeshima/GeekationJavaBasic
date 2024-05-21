package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		//実装内容１
		int a = 100;
		int b = 10;
		
		boolean isResult = (a > b);
		
		System.out.println(isResult);
		
		//実装内容２
		boolean isSunny = true;
		boolean isWarm = true;
		
		boolean isGoodweather = (isSunny && isWarm);
		
		System.out.println(isGoodweather);
		
		//実装内容３
		int x = 10;
		int y = 20;
		
		boolean resultA =  (x > 0 || y % 2 == 0);
		
		System.out.println(resultA);
		
		
		//実装内容４
		
		boolean hasPermission = false;
		
		System.out.println(!(hasPermission));

	}

}
