class Solution1 {
    public String reverseWords(String s) {
        String ans = "";
       String[] arr = s.trim().split("\\s+");
       for(int i= arr.length-1 ; i>0 ; i--){
            ans += arr[i] + " ";
       } 
       ans += arr[0];
       return ans;
    }
}

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.trim().split("\\s+");
        for(int i= arr.length-1 ; i>0 ; i--){
            sb.append(arr[i]).append(" ");
        }
        sb.append(arr[0]);
        return sb.toString();
    }
}
        