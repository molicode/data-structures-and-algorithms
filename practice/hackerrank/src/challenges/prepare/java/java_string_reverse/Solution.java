package challenges.prepare.java.java_string_reverse;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    scanner.close();
    
    String reversed = new StringBuilder(str).reverse().toString();
    System.out.println(str.equals(reversed) ? "Yes" : "No");
  }

}
