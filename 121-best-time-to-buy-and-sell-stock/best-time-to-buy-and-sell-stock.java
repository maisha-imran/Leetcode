// class Solution {
//     public int maxProfit(int[] prices) {
//         int max =0;
//         for ( int i = 0 ; i < prices.length ; i++){
//             for( int j = i+1 ; j < prices.length ; j++){
//             if( prices[i] < prices[j])
//                 max = Math.max( max , prices[j] - prices[i]);
//             }
//         }
//         return max;
//     }
// }
// class Solution {
//     public int maxProfit(int[] prices) {
//         int max =0;
//         for ( int i = 0 ; i < prices.length ; i++){
//             for( int j = i+1 ; j < prices.length ; j++){
//             if( (prices[j] - prices[i]) > max)
//                 max = prices[j] - prices[i];
//             }
//         }
//         return max;
//     }
// }

class Solution {
    public int maxProfit(int[] prices) {
        int min =Integer.MAX_VALUE;
        int profit = 0;
        for ( int i = 0 ; i < prices.length ; i++){
            if( prices[i] < min)
                min = prices[i];
            if( prices[i] == min)
                continue;
            if( prices[i] > min)
                profit = Math.max( profit, prices[i] - min);
        }
        return profit;
    }
}
