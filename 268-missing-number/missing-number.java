class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0, c=0;
        for(int num : nums){
            c = i ^ num;
            if( c != 0)
                break;
            else 
                i++;
        }
        return i;
    }
}