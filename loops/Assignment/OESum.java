
import java.util.*;
public class OESum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        int choice;
        int esum = 0 ;
        int osum = 0;

        do { 
            System.out.println("Enter the no: ");
            no = sc.nextInt();

            if(no % 2 == 0){
                esum = esum + no ;
            
            }else{
                osum += no; 
            }

            System.out.println("Press 1 if want to add another no and any key for exit : ");
             choice = sc.nextInt();
             
            

        } while ( choice == 1 );

        System.out.print("Sum of odd no is : "+ osum +"\n");
        System.out.println("Sum of even no is : "+ esum +"\n");


    }
}