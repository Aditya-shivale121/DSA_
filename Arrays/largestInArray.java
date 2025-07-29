
public class largestInArray{

    public static int largestNo(int nums[]){
        int largest = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for(int i=0 ; i<nums.length; i++){
            
            if(largest < nums[i]){
                largest = nums[i];

            } }
        for(int i=0 ; i<nums.length; i++){
            
            if(minimum > nums[i]){
                minimum = nums[i];
            }
             }
        System.out.println("Minimum value in array is: " + minimum);
         return largest;
    }

    
         // practice 
         public static  int minimum(int arr[]){
            int minimum = Integer.MAX_VALUE;
            for (int i = 0 ; i < arr.length ;i ++){
                if(arr[i] < minimum){
                    minimum = arr[i];
                }
            }
            return minimum;
         }
    public static void main(String[] args) {
        int nums[] = {2,24,6,8,36,1,214,16};
    

        System.out.println(minimum(nums));

    }


    


}