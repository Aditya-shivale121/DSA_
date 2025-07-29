import java.util.Scanner;

public class hollowrectange{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("How many rows you Want : ");
        int rows = sc.nextInt();
        System.out.print("How many cols you Want : ");
        int cols = sc.nextInt();

        for(int i = 1 ;i <= rows; i++){
            for (int j = 1 ; j <= cols  ; j++){
                if( (i == 1)  || j == 1 || i == rows || j == cols){
                    System.out.print(" * ");

                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");

        }

    }
}