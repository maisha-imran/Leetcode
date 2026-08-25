// class Solution {   BRUTE
//     public int maxSubArray(int[] nums) {
//         int max = Integer.MIN_VALUE;
//         int sum = 0;
//         for( int i = 0 ; i < nums.length ; i++){
//             for( int j = i ; j < nums.length ; j++){
//                  sum += nums[j];
//                 if( sum > max )
//                     max = sum;
//             }
//             sum = 0;
//         }
//         return max;   
//     }
// }

class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for( int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
                max = Math.max( sum , max);
            if( sum < 0){
                sum =0;
                max = Math.max( nums[i] , max);
            }
        }
        return max;   
    }
}
