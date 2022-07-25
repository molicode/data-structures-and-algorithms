package challenges.prepare.java.pattern_syntax_checker;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int testCase = Integer.parseInt(scanner.nextLine());
    while (testCase > 0) {
      String patternIn = scanner.nextLine();
      try {
        Pattern pattern = Pattern.compile(patternIn);
        System.out.println("Valid");
      } catch (Exception e) {
        System.out.println("Invalid");
      }
      testCase--;
    }
  }

}
