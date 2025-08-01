// Given an array of n non-negative integers representing the elevation map where the width of each bar is 1, compute how much water it can trap after raining.Input:  height = [4,2,0,6,3,2,5]
// Output: 9


public class TrappedRainwater{
    public static int trap(int height[]){
        int n = height.length;
        if (n==0)return 0;
        
        // declare
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        //build leftmax
        leftMax[0] = height[0];
        for(int i=1 ; i<n ; i++){
            leftMax[i] =Math.max(height[i],leftMax[i-1]);
        }

        // build rightmax
        rightMax[n-1]= height[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            rightMax[i]= Math.max(height[i],rightMax[i+1] );
        }

        // calculate trapped water
        int trappedWater = 0;
        for(int i =0; i<n ; i++){
            trappedWater += Math.min(leftMax[i],rightMax[i])-height[i];
        }
        System.out.print("total trappedWater is: ");
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};

        System.out.println(trap(height));
        
    } 
} 