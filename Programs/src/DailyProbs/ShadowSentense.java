package DailyProbs;

public class ShadowSentense {

    public static boolean isLengthMatchedButCharactersNotSame(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";

        boolean isLengthMatchedButCharactersNotSame = isLengthMatchedButCharactersNotSame(str1, str2);

        System.out.println(isLengthMatchedButCharactersNotSame); // true
    }
}