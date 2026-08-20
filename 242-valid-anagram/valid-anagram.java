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

class Solution2 {
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

class Solution3 {
    public boolean isAnagram(String s, String t) {
        if( s.length() != t.length())
            return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for( char ch : s.toCharArray())
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        for ( char ch : t.toCharArray())
            map2.put( ch , map2.getOrDefault(ch , 0) +1);
        if( map1.equals(map2))
           return true;
        else 
            return false;
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}