// Given an integer array nums, return all the triplets [nums[i], nums[j],  nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.Notice that the solution set must not contain duplicate triplets.Example 1:Input:nums = [- 1, 0,  1, 2, -1,-4]   Output:   [ [-1, -1, 2] , [-1, 0, 1] ]

public class triplate{
    public static void triplate(int arr[]){
        for(int i = 0 ; i< arr.length; i++){
            for(int j= i+1; j <arr.length; j++){
                for(int k= j+1 ; k < arr.length; k++){
                    if((arr[i] + arr[j]+ arr[k] ) == 0 && (arr[i] != arr[j]) && (arr[i] != arr[k]&& (arr[j] != arr[k] ))){
                        System.out.println(arr[i] +","+ arr[j]+","+ arr[k]);
                    }
                }
            }
        }
        
    }
    public static void main(String[] args) {
        int nums[] = { -1, 0,  1, 2, -1, -4};
        triplate(nums);
    }

}  