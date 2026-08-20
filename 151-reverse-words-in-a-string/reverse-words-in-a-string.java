class Solution {
    public String reverseWords(String s) {
        String ans = "";
        int i =0;
       String[] arr = s.trim().split("\\s+");
       for( i= arr.length-1 ; i>0 ; i--){
            ans += arr[i] + " ";
       } 
       ans += arr[i];
       return ans;
    }
}