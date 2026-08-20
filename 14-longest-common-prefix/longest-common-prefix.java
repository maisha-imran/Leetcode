class Solution1 {
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

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for ( int i =1 ; i< strs.length ; i++){
            while( ! strs[i].startsWith(prefix))
                prefix = prefix.substring( 0 , prefix.length() -1);
                if( prefix.isEmpty())
                    return prefix;
        }
        return prefix;
    }
}