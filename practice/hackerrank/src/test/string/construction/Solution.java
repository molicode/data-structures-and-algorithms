package test.string.construction;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  static int stringsConstruction(String a, String b) {
    Map<Character, Integer> A = new HashMap<>();
    Map<Character, Integer> B = new HashMap<>();

    char[] charArrayA = a.toCharArray();
    char[] charArrayB = b.toCharArray();

    for (char character : charArrayA) {
      A.put(character, A.getOrDefault(character, 0) + 1);
    }

    for (char character : charArrayB) {
      B.put(character, B.getOrDefault(character, 0) + 1);
    }

    Integer min = null;

    for (char character : charArrayA) {
      int x = A.get(character);
      int bOrDefault = B.getOrDefault(character, 0);

      if (min == null) {
        min = bOrDefault / x;
      } else {
        min = Math.min(min, bOrDefault / x);
      }
    }

    return min;
  }

  public static void main(String[] args) {
    System.out.println(stringsConstruction("abc", "abccba"));
    System.out.println(stringsConstruction("ab", "abcbcb"));
    System.out.println(stringsConstruction("ab", "abccba"));
    System.out.println(stringsConstruction("b", "abccba"));
    System.out.println(stringsConstruction("c", "abccbac"));
    System.out.println(stringsConstruction("c", "abccbac"));
    System.out.println(stringsConstruction("abdd", "adadapqrtsmnckgljj"));
    System.out.println(stringsConstruction("zzz", "zzzzzzzzzzz"));
  }

}
