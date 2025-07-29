// Write a Java method to compute the sum of the digits in an integer

public class digitsome{

    public static void sumofDigi(int no){
        int sum =0;
        while (no>0){
            sum = sum + (no % 10);
            no /= 10;
        }
        System.out.println("sum is: "+ sum);

    }
    public static void main(String[] args) {
        sumofDigi(15);
        

    }
}