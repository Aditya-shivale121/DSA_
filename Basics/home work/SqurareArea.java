
import java.util.Scanner;


public class SqurareArea{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square : ");
        int s = sc.nextInt();
        int area = s*s;
        System.out.print("Area of square is: "+area );
    }

}