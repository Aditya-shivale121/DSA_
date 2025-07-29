import java.util.*;

public class InvertedStar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rows you need in pattern: \n");
        int no = sc.nextInt();
        for(int i = 0; i< no; i++){
            for(int j= 1; (j < no - i + 1) ;j ++){
                System.out.print(" * ");
            
                
            }
            System.out.println(" ");
        }
    }
}