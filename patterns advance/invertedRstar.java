import java.util.*;
public class invertedRstar{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no: ");
        int no = sc.nextInt();
        for (int i =1; i<=no ;i++){
            for(int j =1; (j<= no-i); j++){
                System.out.print("  ");
            
            }
            for (int j=1 ;j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        
    }
}