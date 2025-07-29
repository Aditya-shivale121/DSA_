public class BinarySearch{
    public static int BinarySearch(int arr[], int target){
       int  left = 0; 
       int right = arr.length-1;
       
       while(left <= right){
        int mid = (left + right)/ 2;
        if (arr[mid]== target){
            return mid;
        }else if(target <arr[mid]){
            right = mid- 1;
        }else{
            left = mid+1;
        }
       }
       return -1;
      

        

    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        int num []= {10,15,18,25,35,66};
        int target = 66;

        System.out.println(BinarySearch(num, target));
        
    }
} 