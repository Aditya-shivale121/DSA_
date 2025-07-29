// Write a program to find the factorialof any number entered by the user

import java.util.*;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int fact = 1;
        if (no == 0) {
            fact = 1;
        } else {
            for (int i = 1; i <= no; i++) {

                fact *= i;
            }
            
        }
        System.out.print("Factorial is : " + fact);
    }
}
