// Enter cost of 3 i tems from the user (using float data type)-a pencil ,a pen and an eraser. You have to output the total cost of the items back to the user as their bill.

import java.util.Scanner;
public class bill{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of pencil , pen and eraser respectively ");
        int pencil = sc.nextInt();
        int  pen= sc.nextInt();
        int eraser= sc.nextInt();

        int bill = pencil + pen + eraser  ;
        System.out.println("Your billing price is : "+ bill);
    

}
}