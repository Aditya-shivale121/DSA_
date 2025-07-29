import java.util.*;
public class linearsearch{
    public static int linearSearch(int arr[], int target){
        for(int i=0; i < arr.length; i++){
            if (target == arr[i]){
                System.out.println("target found at index : ");
                return i;
            
            }
        }
        return -1; 

        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num []= {10,15,887,65,75,66};
        int target = 887;

        System.out.println(linearSearch(num, target));
        
    }
}