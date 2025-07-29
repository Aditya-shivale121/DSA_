import java.util.*;

public class fizzbuzz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int no = sc.nextInt();

        int counter3 = 0;
        int counter5 = 0;
        for (int i= 1 ;i<=no; i++){
            counter3+= 1;
            counter5+= 1;
             if (no / counter3 == 3) {
                System.out.println("fizz");
                counter3 = 0;
                
            }
             if (no / counter5 == 5){
                System.out.println("buzz");
                counter5 = 0;
                
            }
            if((no / counter3 == 3) && (no /  counter5 == 5)){

                System.out.println("fizz buzz");
                counter3 = 0;
                counter5 = 0;

            }else {
                System.out.println(i);
            }



            // if(i % 15 == 0 ){
            //     System.out.println("Fizz buzz");
            // } else if( i % 5 ==0 ){
            //     System.out.println("buzz");
            
            // } else if(i % 3 ==0  ){
            //     System.out.println("fizz");
            // }else{
            //     System.out.println(i);
                
            // }
        }

    }
}