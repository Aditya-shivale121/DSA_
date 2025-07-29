
public class largestinarr{
    public static int largestinArray(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<=arr.length-1;i++){
            
            if(arr[i] >= largest){
                largest = arr[i];
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        int num[] = {12,10,8,8,6,4};
        System.out.println(largestinArray(num));
        
    }
}