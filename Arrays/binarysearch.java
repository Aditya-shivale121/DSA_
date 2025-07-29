
public class binarysearch{

    public static int binarysearch(int nums[], int key){
      
        int left = 0 , right = nums.length-1;
            
        while(left <= right){
            int mid = (left + right)/ 2;        
            
            if(nums[mid] == key){
                return mid;
            }
             if (nums[mid] > key){
                right = mid - 1 ;
            }else{
                left = mid + 1;
            }
            
        }
        return  -1 ;
         
    }
    // practice
    public static int binsearch(int arr[],int key){
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == key){
                return mid;
            }
            if (arr[mid] > key){
                right = mid - 1;
            }else{
                left = mid +1 ;
            }
        }
        return -1 ;
        
    }


    public static void main(String[] args) {
        int nums[] = {2,6,8,10,12,14,16};
        int key = 12  ;
    

       // System.out.println(binarysearch(nums, key));
       System.out.println(binsearch(nums, key));

    }


    


}