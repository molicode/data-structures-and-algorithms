package challenges.prepare.java.java_stdin_and_stdout_1;

import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int myFirtsInt = scanner.nextInt();
        final int mySecondInt = scanner.nextInt();
        final int myThirdInt = scanner.nextInt();
        scanner.close();
        
        System.out.println(myFirtsInt);
        System.out.println(mySecondInt);
        System.out.println(myThirdInt);
    }
}
    

