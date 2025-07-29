
import java.util.Scanner;

public class fact{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
     System.out.println("Enter the no whose factorial you want: ");
     int no = Sc.nextInt();
     int fact = 1;
     while (no > 1){
        fact = fact * no;
        no --;
     }
     System.out.println("Factorial is : "+fact);
    }
}