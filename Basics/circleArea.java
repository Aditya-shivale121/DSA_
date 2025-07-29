
import java.util.Scanner;


public class circleArea{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.println("Enter the radius");
        float rad = sc.nextFloat();
        double area = (3.14 * rad * rad) ;
        System.out.println("Area of circle is: ");
        System.out.print(area);


    }
}