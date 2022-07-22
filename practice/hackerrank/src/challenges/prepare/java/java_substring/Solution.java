package challenges.prepare.java.java_substring;

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.next();
    int start = scanner.nextInt();
    int end = scanner.nextInt();

    System.out.println(str.substring(start, end));
  }
}
