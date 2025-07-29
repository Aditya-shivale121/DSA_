import java.util.Scanner;

public class Hrhombus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int no = sc.nextInt();

        for (int i = 1; i <= no; i++) {

            for(int j = 1; j<= no-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<= no; j++){
                if(i==1 || i== no ||j==1 || j==no ){
                System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            for(int j = 1; j<= i; j++){
                System.out.print("  ");
            }
            System.out.println(" ");
            
        }
    }
}