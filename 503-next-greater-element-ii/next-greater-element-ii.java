class Solution1 {
    public int[] nextGreaterElements(int[] nums) {
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = -1;
            for (int j = 1; j < nums.length; j++) {
                int k = (i + j) % nums.length;
                if (nums[k] > nums[i]) {
                    arr[i] = nums[k];
                    break;
                }
            }
        }
        return arr;
    }
}

class Solution3 {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int arr[] = new int[n];
        for (int i = 2 * n - 1; i >= 0; i--) {
            int curr = nums[i % n];
            while (!st.isEmpty() && st.peek() <= curr) {
                st.pop();
            }
            if (i < n) {
                if (st.empty())
                    arr[i % n] = -1;
                else
                    arr[i % n] = st.peek();
            }
            st.push(curr);
        }
        return arr;
    }
}

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = -1;
            for (int j = i+1; j < i+ nums.length ; j++) {
                if (nums[j % nums.length] > nums[i]) {
                    arr[i] = nums[j % nums.length];
                    break;
                }
            }
        }
        return arr;
    }
}
