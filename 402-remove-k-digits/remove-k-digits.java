class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if (k == n)
            return "0";
        Stack <Character> st = new Stack<>();
        for (int i = 0 ; i < n ; i++) {
            if (st.isEmpty() || k == 0 || st.peek() <= num.charAt(i))
                st.push(num.charAt(i));
            else {
                while(!st.isEmpty() && st.peek() > num.charAt(i) && k > 0){
                    st.pop();
                    k--;
                }
                st.push(num.charAt(i));
            }
        }
        while( k > 0){
            st.pop();
            k--;
        }
        String s = "";
        while(!st.isEmpty()){
            s = st.pop() + s;
        }
        int i = 0;
        while(i < s.length()-1 && s.charAt(i) =='0'){
            i++;
        }
        s = s.substring(i);
        return s;
    }
}