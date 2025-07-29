 // Question1:In a program , input 3 numbers : A ,B and C.You have to out put the average of these 3 numbers
 import java.util.Scanner;
public class Average{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers you have to find average: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float avg = (a+b+c)/3  ;
        System.out.println("Average is : "+avg);
    

}
}