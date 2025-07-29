import java.util.Scanner;
public class invertedhpno{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int no = sc.nextInt();
        for(int i = 1 ; i <= no; i++){
            for(int j=1;j<=no-i+1; j++){
                System.out.print(j+ " ");
            }
            System.out.println("");
        }
    }
}