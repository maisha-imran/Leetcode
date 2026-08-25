class Solution {
    public void sortColors(int[] nums) {
        int c = 0 , c1 = 0;
       for( int num : nums){
        if( num == 0)
            c++;
        else if ( num == 1)
            c1++;
       }
       for ( int i = 0 ; i < c ; i++){
        nums[i] = 0;
       }
       for ( int i = c ; i < c1 + c; i++){
        nums[i] = 1;
       }
       for ( int i = c1 + c ; i < nums.length ; i++){
        nums[i] = 2;
       }
    }
}