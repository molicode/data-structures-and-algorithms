package challenges.prepare.java.java_stdin_and_stdout_2;

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int anInt = scanner.nextInt();
        final double aDouble = scanner.nextDouble();
        scanner.nextLine();
        final String aString = scanner.nextLine();
        scanner.close();

        System.out.println("String: " + aString);
        System.out.println("Double: " + aDouble);
        System.out.println("Int: " + anInt);
    }
}
    

