package challenges.prepare.java.java_end_of_file;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; scanner.hasNext(); i++) {
            System.out.println(i + " " + scanner.nextLine());
        }
        scanner.close();
    }
}
