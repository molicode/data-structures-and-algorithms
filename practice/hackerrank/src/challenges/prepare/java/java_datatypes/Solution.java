package challenges.prepare.java.java_datatypes;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anInt = scanner.nextInt();

        for (int i = 0; i < anInt; i++) {
            try {
                long aLong = scanner.nextLong();
                System.out.println(aLong + " can be fitted in:");

                if (aLong >= -128 && aLong <= 127) System.out.println("* byte");
                if (aLong >= -32768 && aLong <= 32767) System.out.println("* short");
                if (aLong >= -2147483648 && aLong <= 2147483647) System.out.println("* int");
                if (aLong >= (-(Math.pow(2, 63))) && aLong <= (Math.pow(2, 63) - 1)) System.out.println("* long");
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }

        }
    }

}
