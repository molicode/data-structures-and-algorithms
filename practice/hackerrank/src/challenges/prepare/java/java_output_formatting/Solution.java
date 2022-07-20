package challenges.prepare.java.java_output_formatting;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String aString = scanner.next();
            int anInt = scanner.nextInt();
            System.out.printf("%-14s %03d%n", aString, anInt);
        }
        System.out.println("================================");
        scanner.close();
    }
}
