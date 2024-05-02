package DailyProbs;

public class LongestCommonSubStrOfTwoStr {
	static int[][] dp;
    public static String lcs(String text1, String text2) {
    	 int[][] dp = longestCommonSubsequence(text1, text2);

         /*for (int i = 0; i < dp.length; i++) {
             for (int j = 0; j < dp[0].length; j++) {
                 System.out.print(dp[i][j] + " ");
             }
             System.out.println();
         }
         System.out.println();*/

         StringBuilder lcs = new StringBuilder();

         int i = text1.length();
         int j = text2.length();

         while (i > 0 && j > 0) {

             if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                 lcs.append(text1.charAt(i - 1));
                 i--;
                 j--;
             } else if (dp[i - 1][j] > dp[i][j - 1]) {
                 i--;
             } else {
                 j--;
             }
         }
         return lcs.reverse().toString();
    }
    
    private static int[][] longestCommonSubsequence(String text1, String text2) {

        int m = text1.length();
        int n = text2.length();

        dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {

                if (i == 0 || j == 0) { // this part is just initialization
                    dp[i][j] = 0;
                    continue;
                }

                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp;
    }


    public static void main(String[] args) {
        String str1 = "ABCDGH";
        String str2 = "AEDFHR";

        System.out.println(lcs(str1, str2));
    }
}