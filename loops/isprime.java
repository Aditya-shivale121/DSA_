import java.util.*;

public class isprime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no you Want to check: \n");
        int n = sc.nextInt();

        

        if (n == 2){
            System.out.println("no is prime ");

        }else{
            boolean isprime = true;
            for (int i = 2 ; i<= Math.sqrt(n); i++ ){
                if( (n % i) == 0){
                    isprime = false;
                    
                }
                
            }
            if (isprime == true){
                System.out.println("NO is prime");
            }else{
                System.out.println("Not a prime no");
            }
            

            
        }
    }
}