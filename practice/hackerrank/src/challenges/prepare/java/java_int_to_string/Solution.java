package challenges.prepare.java.java_int_to_string;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anInt = scanner.nextInt();
        String aString = String.valueOf(anInt);
        if (anInt == Integer.parseInt(aString)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }
    }
}
