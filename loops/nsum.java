import java.util.*;

public class nsum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int counter = 1;
        int sum = 0 ;
        while (counter <= no){
            sum += counter;
            counter ++;

        }
        System.out.println("Sum of first" + no + "natural no is: "+ sum);

    }
}