package DailyProbs;

public class TimeConversion {
	public static void main(String[] args) {
		int num = 45;//126
		System.out.println(solution(num));
		 
	}

	private static String  solution(int num) {
		int min = num%60;
		int hours = num/60;
		
		return hours+" : "+min;//
	}
	
}
