import java.util.*;

public class calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.err.println("Enter the first no ");
       float a = sc.nextFloat();
       System.out.println("Enter Second no: ");
       float b = sc.nextFloat();
       sc.nextLine(); // consume leftover newline
       System.out.println("Enter the operation you want to perform ");
       String op = sc.nextLine();

       switch (op) {
        case "+" : System.out.println("Addition of two no is :"+ (a+b));
        break;
        case "-" : System.out.println("Substraction of two no is :"+ (a-b));
        break;
        case "*": System.out.println("Multiplication of two no is :"+ (a*b));
        break;
        case "/" : System.out.println("Division of two no is :"+ (a/b));
        break;
        case "%" : System.out.println(" Remender is  :"+ (a%b));
        break;
        default:
            System.out.println("Invalid operation");
       }

    }
}