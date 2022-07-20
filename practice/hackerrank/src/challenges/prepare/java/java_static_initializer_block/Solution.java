package challenges.prepare.java.java_static_initializer_block;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static int breadth;
    static int height;

    public static void main(String[] args) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        breadth = Integer.parseInt(bufferedReader.readLine());
        height = Integer.parseInt(bufferedReader.readLine());
        if (breadth > 0 && height > 0) {
            System.out.println(breadth * height);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

        bufferedReader.close();

    }
}
