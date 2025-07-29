// Write a program to print the multiplication table of a number N, entered by the user

import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no you want table: ");
        int no = sc.nextInt();
        for (int i = 1 ; i<= 10 ;i++){
            
            int table= no *i;
            System.out.println(table);
            


        }
    }
}