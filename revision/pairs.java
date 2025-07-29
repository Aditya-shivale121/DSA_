
public class pairs{
    public static void PairsInArr(int arr[]){
        for(int i=0; i < arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                
                System.out.print("("+arr[i]+","+arr[j]+")");
                
            }
            System.out.println("");
        }

        
 
    }
    public static void main(String[] args) {
        int num[] = {12,10,8,8,6,4};
        PairsInArr(num);
        
        
    }
}