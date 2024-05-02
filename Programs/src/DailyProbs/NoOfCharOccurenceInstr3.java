package DailyProbs;

public class NoOfCharOccurenceInstr3 {
	public static void main(String[] args) {
		String s = "my name is suraj sainath malge";
		String str = s.replaceAll("\\s", "");
		
		solution(str);
	}

	private static void solution(String str) {
		
		int len = str.length();
		
		int arr[] = new int[256];
//		
		char ch[] = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)]++;
		}
		
		
		
		for (int i = 0; i < len; i++) {
			
			int find=0;
			ch[i] = str.charAt(i);//
			
			for(int j=0;j<i;j++) {
				if(str.charAt(i)==ch[j]) {
					find++;
				}
			}
			
			if(find==1)
			System.out.print(str.charAt(i)+""+arr[str.charAt(i)]);
		}
		
		
		
	}
}
