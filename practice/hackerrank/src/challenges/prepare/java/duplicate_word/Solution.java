package challenges.prepare.java.duplicate_word;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

  public static void main(String[] args) {

    String regex = "\\b(\\w+)(\\W+\\1\\b)+";
    Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

    Scanner scan = new Scanner(System.in);
    int numSentences = Integer.parseInt(scan.nextLine());

    while (numSentences-- > 0) {
      String input = scan.nextLine();

      Matcher matcher = pattern.matcher(input);

      while (matcher.find()) {
        input = input.replaceAll(matcher.group(), matcher.group(1));
      }

      System.out.println(input);
    }
    scan.close();

  }

}
