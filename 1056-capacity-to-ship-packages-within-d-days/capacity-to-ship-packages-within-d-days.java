class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = weights[0], sum = 0;
        for ( int i=0; i < weights.length ; i++){
            max = Math.max(max, weights[i]);
            sum += weights[i];
        }
        int ans = -1;
        int l=max , h = sum;
        while ( l <= h){
            int m = l + (h-l)/2;
            if( ispossible(m , weights) <= days){
                ans = m;
                h = m -1;
            }
            else 
                l= m+1;
        }
        return ans;
    }
    private long ispossible( int m , int weights[]){
        long si =0;
        int day=1;
        for( int j=0; j < weights.length; j++){
           if(si + weights[j] <= m)
                si += weights[j];
            else{
                day++;
                si = weights[j];
            }
        }
    return day; 
    }
}