import java.util.*;

public class largestof3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c ;
        System.out.println("Enter the 3 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a<=b && b<=c) {
            System.out.println("Gretest value is: "+ c);
            
        }else if (b>=c && b>=a){
            System.out.println("Gretest value is: "+ b);
        }else{
            System.out.println("Gretest value is: "+ a);
        }

    }
}