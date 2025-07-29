
public class subarr{
    public static void SubArr(int arr[]){
        int count =0;
        for(int i=0; i < arr.length; i++){
            for(int j = i; j<arr.length; j++){
                
                for(int k =i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                 System.out.println("");
                 count ++;
            }
           
        }
        System.out.println("No of pairs are "+count);

        
 
    }
    public static void main(String[] args) {
        int num[] = {12,10,8,8,6,4};
        SubArr(num);
        
        
    }
}