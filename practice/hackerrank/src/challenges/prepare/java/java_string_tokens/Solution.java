package challenges.prepare.java.java_string_tokens;

import java.util.Scanner;

public class Solution {

  private static final String REGEX = "[^A-Za-z]+";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    scanner.close();

    str = str.trim(); 

    if (str.length() == 0) {
      System.out.println(0);
      return;
    }
    
    String[] words = str.split(REGEX);
    System.out.println(words.length);
    for (String word : words) {
        System.out.println(word);
    }

  }
  


}
