class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int ans [] = new int[n];
        int i = 0 , j = 1;
        for ( int num : nums){
            if( num  > 0){
                ans[i] = num;
                i = i+2;
            }
            else{
                ans[j] = num;
                j = j+2;
            }
        }
        return ans;
    }
}