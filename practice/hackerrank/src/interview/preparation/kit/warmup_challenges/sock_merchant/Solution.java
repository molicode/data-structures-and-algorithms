package interview.preparation.kit.warmup_challenges.sock_merchant;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

class Result {

  /*
   * Complete the 'sockMerchant' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER n
   *  2. INTEGER_ARRAY ar
   */

  public static int sockMerchant(int n, List<Integer> ar) {
    HashSet<Integer> colors = new HashSet<>();

    int count = 0;
    for (int i = 0; i < n; i++) {
      int element = ar.get(i);
      if (colors.contains(element)) {
        colors.remove(element);
        count++;
      } else {
        colors.add(element);
      }
    }
    return count;

  }
}

  public class Solution {

    public static void main(String[] args) throws IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      int n = Integer.parseInt(bufferedReader.readLine().trim());

      List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
          .map(Integer::parseInt)
          .collect(toList());

      int result = Result.sockMerchant(n, ar);

      bufferedWriter.write(String.valueOf(result));
      bufferedWriter.newLine();

      bufferedReader.close();
      bufferedWriter.close();
    }
  }

