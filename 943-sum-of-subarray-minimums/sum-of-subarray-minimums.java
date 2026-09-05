class Solution1 {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for( int i = 0 ; i <n ; i++){
            int min = arr[i];
            for( int j =i ; j < n ; j++){
                min = Math.min( arr[j] , min);
            sum = (sum + min)  %  1000000007;
            }
        }
        return sum;
    }
}


class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long mod = 1000000007;

        int[] nse = new int[n];
        int[] pse = new int[n];

        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        for( int i = n - 1 ; i >= 0 ; i--){
            while( !st1.isEmpty() && arr[st1.peek()] >= arr[i])
                st1.pop();
            if( st1.isEmpty())
                nse[i] = n;
            else 
                nse[i] = st1.peek();
            st1.push(i);
        }

        for( int i = 0 ; i < n ; i++){
            while( !st2.isEmpty() && arr[st2.peek()] > arr[i])
                st2.pop();
            if( st2.isEmpty())
                pse[i] = -1;
            else 
                pse[i] = st2.peek();
            st2.push(i);
        }

        long sum = 0;
        for( int i = 0 ; i < arr.length ; i++){
            long left = i - pse[i];
            long right = nse[i] - i;
            
            long x = (left * right) % mod;
            x = (x * arr[i]) % mod;

            sum = (sum + x) % mod;
        }
        return (int)sum;
    }
}


