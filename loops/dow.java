import java.util.*;

public class dow{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do { 
            int no = sc.nextInt();
       
            if(no % 10 == 0){
                break;
            }
             System.out.println(no);
                 
        } while (true);
       
    }
}