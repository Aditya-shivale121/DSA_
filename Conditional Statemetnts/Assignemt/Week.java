// Write a Java program to input week number (1-7)and print day of week name using switch case

import java.util.Scanner;
public class Week{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no between 1 to 7");
        int no = sc.nextInt();

        switch (no) {
            case 1: System.out.println("Day is Monday");
                
                break;
            case 2: System.out.println("Day is Tuesday");
                
                break;
            case 3: System.out.println("Day is Wednesday");
                
                break;
            case 4: System.out.println("Day is Thursday");
                
                break;
            case 5: System.out.println("Day is Friday");
                
                break;
            case 6: System.out.println("Day is Saturday");
                
                break;
            case 7: System.out.println("Day is Sunday");
                
                break;
            default:
                System.out.println("Invalid input");
        }
        
    }
}