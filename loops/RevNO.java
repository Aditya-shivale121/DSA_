import java.util.*;

public class RevNO{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no you want to reverse: \n");
        int no = sc.nextInt();
        while (no > 0){
           int  LastDigi = no % 10 ;
           System.out.print(LastDigi);
           no = no / 10 ;

        }
        
    }
}