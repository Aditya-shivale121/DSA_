
public class isnoprime {

    private static boolean isPrime;

    public static boolean isPrime(int no) {

        for (int i = 2; i < no; i++) {
            if (no % i == 0) {
                return false;
            }
        }
        return true;

   }

    public static void primeinRange(int no){
       for (int i =2 ; i <= no ; i++){
        if(isPrime(i)){
           System.out.print(" "+ i);
        }
       }
    }

    public static void main(String[] args) {
        primeinRange(100);

    }
}
