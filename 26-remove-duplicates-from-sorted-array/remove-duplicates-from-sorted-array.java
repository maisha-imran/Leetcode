class Solution {
    public int removeDuplicates(int[] nums) {
        TreeMap < Integer , Integer > map = new TreeMap<>();
        int c =0;
        for ( int num : nums){
            map.put( num , map.getOrDefault( num , 0) + 1);
        }
        for ( int key : map.keySet()){
            nums[c] = key;
            c++;
        }
        return c;
    }
}