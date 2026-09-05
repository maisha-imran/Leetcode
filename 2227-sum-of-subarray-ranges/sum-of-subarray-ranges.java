class Solution {
    public long subArrayRanges(int[] arr) {
        int n = arr.length;

        int[] nse = new int[n];
        int[] pse = new int[n];

        int[] nle = new int[n];
        int[] ple = new int[n];

        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
        Stack<Integer> st4 = new Stack<>();

        for( int i = n - 1 ; i >= 0 ; i--){
            while( !st1.isEmpty() && arr[st1.peek()] >= arr[i])
                st1.pop();
            if( st1.isEmpty())
                nse[i] = n;
            else 
                nse[i] = st1.peek();
            st1.push(i);
            
            while( !st3.isEmpty() && arr[st3.peek()] <= arr[i])
                st3.pop();
            if( st3.isEmpty())
                nle[i] = n;
            else 
                nle[i] = st3.peek();
            st3.push(i);
        }

        for( int i = 0 ; i < n ; i++){
            while( !st2.isEmpty() && arr[st2.peek()] > arr[i])
                st2.pop();
            if( st2.isEmpty())
                pse[i] = -1;
            else 
                pse[i] = st2.peek();
            st2.push(i);

            while( !st4.isEmpty() && arr[st4.peek()] < arr[i])
                st4.pop();
            if( st4.isEmpty())
                ple[i] = -1;
            else 
                ple[i] = st4.peek();
            st4.push(i);
        }

        long sum = 0;
        for( int i = 0 ; i < arr.length ; i++){
            long leftsmall = i - pse[i];
            long rightsmall = nse[i] - i;
            long leftlarge = i - ple[i];
            long rightlarge = nle[i] - i;
            
            long x = (leftsmall * rightsmall);
            x = (x * arr[i]);

            long y = (leftlarge * rightlarge);
            y = (y * arr[i]);

            sum = (sum + (y - x));
        }
        return sum;
    }
}
