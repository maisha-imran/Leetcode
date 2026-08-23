class Solution {
    public int minBitFlips(int start, int goal) {
        int c =0;
        int diff = start ^ goal;
        while ( diff != 0){
            if( (diff & 1) == 1)
                c++;
            diff >>= 1;
        }
        return c;
    }
}