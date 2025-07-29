
import java.util.*;

public class arrayeg{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // define array
        int numbers[] = new int[5];
        String fruits[] = {"mango" ,  "apple", "guava"};
        System.out.println(fruits);
        //setting values
        numbers[0] = 50;
        numbers[1 ]=sc.nextInt(); //taking input
        numbers[2]= numbers[1] + 2;// updation
        //output
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        // claulating length of array
        System.out.print(" Length of the numbers array is : "+ numbers.length);

    }
}