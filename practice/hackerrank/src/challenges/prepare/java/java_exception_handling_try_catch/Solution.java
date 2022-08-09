package challenges.prepare.java.java_exception_handling_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {

    try {
      Scanner scan = new Scanner(System.in);
      int x = scan.nextInt();
      int y = scan.nextInt();
      int z = x / y;
      System.out.println(z);
      scan.close();
    } catch (InputMismatchException ime) {
      System.out.print("java.util.InputMismatchException");
    } catch (ArithmeticException ae) {
      System.out.print("java.lang.ArithmeticException: " + ae.getMessage());
    }

  }

}
