package test.formar.palabra;

import java.util.HashMap;
import java.util.Map;

public class SolutionB {

  public static int countSubStr(String str, String substr) {
    HashMap<Character, Integer> freq1 = new HashMap<>();
    HashMap<Character, Integer> freq2 = new HashMap<>();

    int i, mn = Integer.MAX_VALUE;
    int l1 = str.length();
    int l2 = substr.length();

    for (int idx = 0; idx < str.length(); idx++) {
      char c = str.charAt(idx);
      if (freq1.containsKey(c)) {

        freq1.put(c, freq1.get(c) + 1);
      } else {

        freq1.put(c, 1);
      }
    }

    for (int idx = 0; idx < substr.length(); idx++) {
      char c = substr.charAt(idx);
      if (freq2.containsKey(c)) {

        freq2.put(c, freq2.get(c) + 1);
      } else {

        freq2.put(c, 1);
      }
    }

    for (Map.Entry mapElement : freq2.entrySet()) {
      char first = (char) mapElement.getKey();
      int second = (int) mapElement.getValue();
      int second_f1 = freq1.get(first);
      mn = Math.min(mn, second_f1 / second);
    }

    return mn;
  }

  // Driver program to test above
  public static void main(String[] args) {
    String str1 = "arajjhupoot";
    String str2 = "rajput";
    System.out.println(countSubStr(str1, str2));
  }
}
