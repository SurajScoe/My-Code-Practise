package DailyProbs;

public class NoOfCharOccurrencesInStr2 {
	public static void main(String[] args) {
		String s = "my name is suraj sainath malge";
		String str = s.replaceAll("\\s", "");
		
		int arr[] = solution(str);
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=1)
			System.out.print((char)(i+'a')+""+arr[i]);
		}
	}

	private static int[] solution(String str) {
		
		int arrCount[] = new int[26];
		
		for(char ch : str.toCharArray()){
			if(Character.isLetter(ch))
			arrCount[ch-'a']++;
		}
		
		return arrCount;
		
	}
}
