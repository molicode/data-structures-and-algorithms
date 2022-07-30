package test.formar.palabra;

public class SolucionA {

  // that can be formed using characters of str1
  static int findNumberOfTimes(String str1, String str2) {
    int freq[] = new int[26];
    int freq2[] = new int[26];

    int l1 = str1.length();

    // iterate and mark the frequencies of
    // all characters in str1
    for (int i = 0; i < l1; i++) {
      freq[str1.charAt(i) - 'a'] += 1;
    }
    int l2 = str2.length();
    for (int i = 0; i < l2; i++) {
      freq2[str2.charAt(i) - 'a'] += 1;
    }

    int count = Integer.MAX_VALUE;

    // find the minimum frequency of
    // every character in str1
    for (int i = 0; i < l2; i++) {
      if (freq2[str2.charAt(i) - 'a'] != 0) {
        count = Math.min(count,
            freq[str2.charAt(i) - 'a'] / freq2[str2.charAt(i) - 'a']);
      }
    }

    return count;
  }

  public static void main(String[] args) {

    String str1 = "foreeksgekseg";
    String str2 = "geeks";
    System.out.println(findNumberOfTimes(str1, str2));

  }

}
