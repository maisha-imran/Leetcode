class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int[] nme = new int[n];
        int[] pme = new int[n];

        int nextmax = -1;
        nme[n-1] = -1;
        for( int i = n - 2 ; i >= 0 ; i--){
            nextmax = Math.max(height[i+1] , nextmax);
            nme[i] = nextmax;
        }   

        int prevmax = -1;
        pme[0] = prevmax;
        for( int i = 1 ; i < n ; i++){
            prevmax = Math.max(height[i-1] , prevmax);
            pme[i] = prevmax;
        }

        int sum = 0;
        for( int i = 0 ; i < height.length ; i++){
            int hold = Math.min(nme[i] , pme[i]) - height[i];
            if( hold <= 0)
                continue;
            sum += hold;
        }
        return sum;
    }
}