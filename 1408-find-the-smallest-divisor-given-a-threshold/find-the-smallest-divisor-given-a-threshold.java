class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = nums[0];
        for ( int i=1; i < nums.length ; i++){
            max = Math.max(max, nums[i]);
        }
        int ans = -1;
        int l=1 , h = max;
        while ( l <= h){
            int m = l + (h-l)/2;
            if( ispossible(m , nums) <= threshold){
                ans = m;
                h = m -1;
            }
            else 
                l= m+1;
        }
        return ans;
    }
    private long ispossible( int m , int nums[]){
        long sum =0;
        for( int j=0; j < nums.length; j++){
            sum += (nums[j] + m -1)/m;
        }
        return sum; 
    }
}
    