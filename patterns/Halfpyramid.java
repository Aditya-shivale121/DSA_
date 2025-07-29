import java.util.*;

public class Halfpyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rows you need in pattern: \n");
        int no = sc.nextInt();
        for(int i = 1; i<= no; i++){
            for(int j= 1; j<= i ;j ++){
                System.out.print(" "+ j);
            }
            System.out.println(" ");
        }
    }
}