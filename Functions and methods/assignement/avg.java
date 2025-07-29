// Write a Java method to compute the averageof three numbers..
public class avg{

    public static void avg3(int a, int b, int c){
        int avg= a+b+c;
        System.out.println("Average is: "+ avg/3);
    }
    public static void main(String[] args) {

        avg3(5, 4, 3);
        
    }
}