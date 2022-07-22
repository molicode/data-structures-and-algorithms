package challenges.prepare.java.java_string_compare;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    int k = scanner.nextInt();
    scanner.close();

    System.out.println(getSmallestAndLargest(s, k));
  }

  private static String getSmallestAndLargest(String s, int k) {
    String smallest = s.substring(0, k);
    String largest = s.substring(0, k);

    for (int i = 0; i <= s.length() - k; i++) {
      String currentSubString = s.substring(i, i + k);
      if (smallest.compareTo(currentSubString) > 0) {
        smallest = currentSubString;
      }
      if (largest.compareTo(currentSubString) < 0) {
        largest = currentSubString;
      }
    }
    return smallest + "\n" + largest;
  }
  
}
