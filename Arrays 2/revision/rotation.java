
// There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might        be        rotated        at        pivot        index 3   and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.You must write an algorithm with O(log n) runtime complexity.
// Example 1:Input:nums = [4,  5, 6, 7, 0, 1, 2], target = 0 Output:   4 
// Example 2:Input:nums = [4,  5, 6, 7, 0, 1, 2], target = 3Output:   -1 
public class rotation {

    public static int arrayCC(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
       
        while (left <= right) {
             int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }
        return -1 ;

    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 3; 

        System.out.println(arrayCC(arr, target));

    }
}
