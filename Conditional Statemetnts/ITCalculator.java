 import java.util.*;

public class ITCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary: ");
        int salary   = sc.nextInt();
        int tax = 0 ;
        if (salary < 500000){
            System.out.println("Tax on your salary is : " + tax );

        }else if ( 500000 <= salary && 1000000 >= salary){
            tax = salary *=.20;
            System.out.println("Tax is : "+ tax);
        }else{
            tax = salary *= .30;
            System.out.println("Tax on salary is "+ tax);
        }

        
    }
}