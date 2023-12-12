public class trapping_rainwater {

    // Helper Arrays
    
    public static int trappedRainwater(int height[]) { // O(n) - linear
        int n = height.length;
        // Calculate leftMax Boundary - array :
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // Calculate rightMax Boundary - array: 
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int j = n - 2; j >= 0; j--) {
            rightMax[j] = Math.max(height[j], rightMax[j+1]);
        }

        int trappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterlevel = Min(leftMax, RightMax)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterlevel - height[i]
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
        
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainwater(height));
    }
}
