import java.util.*;

public class charpiryamid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many rows you want ");
        int no =sc.nextInt();
        char ch = 'A';
        for(int i = 1; i <=no ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print(ch+ " ");
                ch+=1;
            }
            System.out.println();
        }
    }
}