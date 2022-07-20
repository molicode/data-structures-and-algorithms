package challenges.prepare.java.java_strings_introduction;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String aFirstString = scanner.nextLine();
    String aSecondtString = scanner.nextLine();

    

    System.out.println(lengthsStringSum(aFirstString, aSecondtString));

    int i = aFirstString.compareTo(aSecondtString);
    if (i > 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    
    System.out.println(toCapitalCase(aFirstString) + " " + toCapitalCase(aSecondtString));
  }

  private static int lengthsStringSum(String a, String b) {
    return a.length() + b.length();
  }

  private static String toCapitalCase(String str) {
    return str.substring(0, 1).toUpperCase() + str.substring(1);
  }
}