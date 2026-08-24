class Solution1 {
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

class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0 ;
        for( int j =0 ; j < nums.length ; j++){
            if( nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}