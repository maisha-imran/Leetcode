// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
//         int sum = 0;
//         int len = Integer.MAX_VALUE;
//         for( int i = 0 ; i < nums.length ; i++){
//             for( int j = i ; j < nums.length ; j++){
//                 sum += nums[j];
//                 if( sum >= target){
//                     len = Math.min( len , j-i+1);
//                     break;
//                 }
//             }
//             sum = 0;
//         }
//         return (len == Integer.MAX_VALUE)? 0 : len;  
//     }
// }

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0 , r = 0 , sum = 0;
        int len = Integer.MAX_VALUE;
        while( r < nums.length){
            if( sum < target){
                sum += nums[r];
                r++;
            }
            while( sum >= target){
                len = Math.min( len , r - l );
                sum -= nums[l];
                l++;
            }
        }
        return (len == Integer.MAX_VALUE)? 0 : len;
    }
}

