package challenges.prepare.java.java_anagrams;

import java.util.Scanner;

public class Solution {

  static boolean isAnagram(String a, String b) {

    if (a.length() != b.length()) {
      return false;
    }
    
    String strA = a.toLowerCase();
    String strB = b.toLowerCase();

    int[] arrayStrA = new int[256];
    int[] arrayStrB = new int[256];

    for (int i = 0; i < strA.length(); i++) {
      arrayStrA[strA.charAt(i)] += 1;
      arrayStrB[strB.charAt(i)] += 1;
    }

    for (int i = 0; i < 256; i++) {
      if (arrayStrA[i] != arrayStrB[i]) {
        return false;
      }
    }

    return true;

  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println((ret) ? "Anagrams" : "Not Anagrams");
  }
}


