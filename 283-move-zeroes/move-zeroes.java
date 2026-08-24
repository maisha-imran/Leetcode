class Solution {
    public void moveZeroes(int[] nums) { 
        int i =0;
        for( int j = 0; j < nums.length  ; j++){
            if( nums[j] != 0){
                if( i != j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                }
                i++;
            }  
        }
    }
}