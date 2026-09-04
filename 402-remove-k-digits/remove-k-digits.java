class Solution {
    public String removeKdigits(String num, int k) {
        if (k == num.length())
            return "0";
        Stack <Character> st = new Stack<>();
        for (int i = 0 ; i < num.length() ; i++) {
            if (st.isEmpty() || k == 0)
                st.push(num.charAt(i));
            else {
                if (st.peek() <= num.charAt(i))
                    st.push(num.charAt(i));
                else {
                    while(!st.isEmpty() && st.peek() > num.charAt(i)){
                        st.pop();
                        k--;
                        if( k ==0)
                            break;
                    }
                    st.push(num.charAt(i));
                }
            }
        }
        while( k > 0){
            st.pop();
            k--;
        }
        String s = "";
        while (!st.isEmpty()) {
            s = st.pop() + s;
        }
    int i = 0;
    while (i < s.length() - 1 && s.charAt(i) == '0') {
        i++;
    }
    s = s.substring(i);
    return s;
    }
}