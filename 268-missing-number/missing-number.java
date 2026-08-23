class Solution1 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0, c = 0;
        for (int num : nums) {
            c = i ^ num;
            if (c != 0)
                break;
            else
                i++;
        }
        return i;
    }
}

class Solution2 {
    public int missingNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans ^= i;
            ans ^= nums[i];
        }
        return ans ^ nums.length;
    }
}

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int s =0;
        int sum = (n*(n+1))/2;
        for(int num : nums){
            s+=num;
        }
        return sum - s;
    }
}