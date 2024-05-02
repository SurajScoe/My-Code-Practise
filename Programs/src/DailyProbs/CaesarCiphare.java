package DailyProbs;
import java.util.*;
public class CaesarCiphare { //to keep track of index
  public static final String alpha = "abcdefghijklmnopqrstuvwxyz";

  public static String encrypt(String message, int shiftKey) {
    message = message.toLowerCase();
    String cipherText = "";
    for (int ii = 0; ii < message.length(); ii++) {
      int charPosition = alpha.indexOf(message.charAt(ii));
      int keyVal = (shiftKey + charPosition) % 26;
      char replaceVal = alpha.charAt(keyVal);
      cipherText += replaceVal;
    }
    return cipherText;
  }
  
  public static String decrypt(String inputStr, int shiftKey) {
	  // convert inputStr into lower case   
      inputStr = inputStr.toLowerCase();   
        
      // decryptStr to store decrypted data   
      String decryptStr = "";   
        
      // use for loop for traversing each character of the input string   
      for (int i = 0; i < inputStr.length(); i++)   
      {   
            
          // get position of each character of inputStr in ALPHABET   
          int pos = alpha.indexOf(inputStr.charAt(i));   
            
          // get decrypted char for each char of inputStr   
          int decryptPos = (pos - shiftKey) % 26;   
            
          // if decryptPos is negative   
          if (decryptPos < 0){   
              decryptPos = alpha.length() + decryptPos;   
          }   
          char decryptChar = alpha.charAt(decryptPos);   
            
          // add decrypted char to decrypted string   
          decryptStr += decryptChar;   
      }   
      // return decrypted string   
      return decryptStr;   
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String message = new String();
    int key = 0;
    System.out.print("Enter the String for Encryption:");
    message = sc.next();

    System.out.println("\n\nEnter Shift Key:");
    key = sc.nextInt();
    System.out.println("\nEncrpyted msg:" + encrypt(message, key));
    
    System.out.println("\nDecrypted msg:" + decrypt(encrypt(message, key), key));
  } //main method ends
} //Solution Class End