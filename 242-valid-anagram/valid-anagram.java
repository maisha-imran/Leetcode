class Solution1 {
    public boolean isAnagram(String s, String t) {
        if( s.length() != t.length())
            return false;
        int freq[] = new int[26];
        for( int i=0; i<s.length() ; i++){
            freq[s.charAt(i) - 'a']++;
        }
        for( int j=0; j<t.length() ; j++){
            freq[t.charAt(j) - 'a']--;
        }
        for( int x : freq){
            if( x !=0)
                return false;
        }
        return true;
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if( s.length() != t.length())
            return false;
        int freq[] = new int[26];
        for( char ch : s.toCharArray())
            freq[ch - 'a']++;
        for( char ch : t.toCharArray())
            freq[ch - 'a']--;
        for( int x : freq){
            if( x !=0)
                return false;
        }
        return true;
    }
}