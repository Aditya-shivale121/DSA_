
import java.util.Scanner;

// Finish the following code so that it prints You h ave a f ever if your temperature is above 100 and otherwise prints You don't have a fever

public class FeverDetector{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your body temperature: ");
        float temp = sc.nextFloat();
        String fev = (temp > 100 ) ? "Fever" : "No Fever" ;
        System.out.println(fev);
    }
}