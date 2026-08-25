class Solution1 {
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

class Solution {
    public void sortColors(int[] nums) {
        int l = 0 , h = nums.length - 1;
        int m = 0 ;
        while( m <= h){
            if( nums[m] == 2){
                swap(nums, m , h);
                h--;
            }
            else if( nums[m] == 0){
                swap( nums, m , l);
                l++;
                m++;
            }
            else
                m++;
        }
    }
    private void swap( int [] nums , int a , int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
