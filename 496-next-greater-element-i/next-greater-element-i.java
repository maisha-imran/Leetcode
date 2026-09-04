class Solution1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            arr[i] = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > nums1[i]) {
                            arr[i] = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return arr;
    }
}

class Solution3 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = new int[nums1.length];

        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!(st.isEmpty()) && st.peek() < nums2[i])
                st.pop();

            if (st.isEmpty())
                map.put(nums2[i], -1);
            else
                map.put(nums2[i], st.peek());
            
            st.push(nums2[i]);
        }

        for (int j = 0; j < nums1.length; j++) {
            arr[j] = map.get(nums1[j]);
        }

        return arr;
    }
}

class Solution{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] = new int[nums2.length];
        HashMap <Integer , Integer > map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i] , -1);
            for (int j = i+1 ; j < nums2.length; j++) {
                if( nums2[j] > nums2[i]){
                    map.put(nums2[i] , nums2[j]);
                    break;
                }
            }
        }
        for ( int k = 0 ; k < nums1.length ; k++){
            nums1[k] = map.get(nums1[k]);
        }
        return nums1;
    }
}