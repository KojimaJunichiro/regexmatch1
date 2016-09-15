
package javaapplication1;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class JavaApplication1 {
    public static boolean isTrue(String str) {
    return str.matches("[tT]True");
    }
    public static boolean containsFalse(String str) {
    return str.matches(".*false*.");
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(isTrue("True"));
        System.out.println(containsFalse("abcdfalsezxcvb"));
        Scanner sc= new Scanner (new FileReader("input.txt"));
        // reads the file "input.txt"
        while(sc.hasNext()){
            System.out.println(sc.nextLine());;
        }
    }
    
}