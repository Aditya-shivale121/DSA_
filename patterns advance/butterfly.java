import java.util.*;

public class butterfly{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int no  = sc.nextInt();
        for(int i=1; i<=no ;i++){
            for (int j=1 ; j<=i ;j++){
                System.out.print("*");
            }
            for (int j=1 ; j<=2*(no-i) ;j++){
                System.out.print(" ");
            }
            for (int j=1 ; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=no; i>=1 ;i--){
            for (int j=i ; j>=1 ;j--){
                System.out.print("*");
            }
            for (int j=2*(no-i) ; j>=1 ;j--){
                System.out.print(" ");
            }
            for (int j=i ; j>=1 ;j--){
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}