import java.util.*;

public class factorial{
    public static int fact (int no){
        int f=1;
        for(int i =1 ; i <= no ; i++){
            f *= i;

        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
        
    }
}