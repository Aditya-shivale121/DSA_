
public class linersearch{

    public static int linersearch(int nums[], int key){
        for(int i=0 ; i<nums.length; i++){
            if(nums[i] == key) return i;
            
            
        }
         return -1;
    }
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,11,12,14,16};
        int key = 10 ;

        System.out.println(linersearch(nums, key));

    }


    


}