
// Question 4:Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.Example 1:Input:height = [0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1]Output:   6 Explanation:The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.Example 2:Input:height = [4, 2, 0, 3, 2, 5]Output:   9 Constraints:•n == height . length•1 <= n <= 2 * 104•0 <= height [ i ] < = 105
public class trapwater {

    public static int trapped(int arr[]) {
        int leftmax[] = new int[arr.length];
        int rightmax[] = new int[arr.length];
        int trappedWater = 0;

        int n = arr.length ;
        if (n == 0) {
            return 0;
        }

        leftmax[0] = arr[0];
        for (int i = 1; i < n; i++) {

            leftmax[i] = Math.max(arr[i], leftmax[i - 1]);
        }

        rightmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(arr[i], rightmax[i + 1]);
        }

        for (int i = 0 ; i < n ; i++){
            trappedWater += Math.min(leftmax[i], rightmax[i])-arr[i]; 

        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 3,2, 5};

        System.out.println(trapped(height));
    }

}
