public class TrappingRainWater {

    // Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

    // time complexity O(N)

    public static int trappedRainWater(int height[]){
        int n = height.length;
        // finding the leftmax boundry
        int leftmax[] = new int [n];
        leftmax[0] = height[0];
        for(int i = 1;  i<n;i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]); 
        }

        // finding the rightmax boundry 
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i = n-2 ; i >= 0; i--){
            rightmax[i] = Math.max(height[i] , rightmax[i+1]);
        }

        int trappedWater = 0;
        for(int i =0; i<n ; i++){
            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;

    }


    public static void main(String[] args) {
        int height[] ={ 4000, 2, 0, 6000, 3, 2, 5 };
        int result = trappedRainWater(height);
        System.out.println("the total trapped rainwater is " + result);
        
    }
}