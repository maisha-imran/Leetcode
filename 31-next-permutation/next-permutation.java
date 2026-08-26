class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i =0;
        for( i = n - 2; i >= 0  ; i--){
            if( nums[i] < nums[i+1])
                break;
        }
        if( i == -1){
            rev( nums , 0 , n-1 );
            return;
        }
        else{
            for( int j = n-1 ; j > i ; j--){
                if( nums[j] > nums[i]){
                   int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
           rev( nums , i+1 , n-1);
           return;
        }
    }
    private void rev( int nums[] , int a, int b ){
        while( a < b){
           int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
    }
}