class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        for ( int i=0 ; i< strs[0].length(); i++){
            if(strs[0].charAt(i) != strs[n-1].charAt(i))
                return strs[0].substring( 0 , i);
        }
        return strs[0];
    }
}