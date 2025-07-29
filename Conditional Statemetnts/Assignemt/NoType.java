//Write a Java program to get a number from the user and print whether it is positive or negative
import java.util.Scanner;
public class NoType{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no: ");
        int no = sc.nextInt();
        String type = (no > 0) ? "positive" : "negative" ;
        System.out.println("the type of no is: "+ type);


    }
}