package challenges.prepare.java.java_if_else;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        int anInt = Integer.parseInt(bufferedReader.readLine().trim());
        if (anInt >= 1 && anInt <= 100) {
            if (anInt % 2 == 0) {
                if (anInt <= 5 || anInt > 20) {
                    out.println("Not Weird");
                }
                if (anInt >= 6 && anInt <= 20) {
                    out.println("Weird");
                }
            } else {
                out.println("Weird");
            }
        }
        bufferedReader.close();
    }
}
