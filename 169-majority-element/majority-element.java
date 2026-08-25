class Solution2 {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap < Integer , Integer > map = new HashMap<>();
        for( int num : nums){
            map.put( num , map.getOrDefault( num , 0)+1);
        }
        for( int key : map.keySet()){
            if(map.get(key) > n/2)
               return key; 
        }
        return -1;
    }
}
class Solution1 {
    public int majorityElement(int[] nums) {
        int c = 0;
        for ( int i =0 ; i < nums.length ; i++){
            for ( int j =0 ; j < nums.length ; j++){
                if( nums[i] == nums[j])
                    c++;
            }
            if( c > (nums.length/2))
                return nums[i];
            c=0;
        }
        return 0;
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        int elem = nums[0];
        int c =0;
        for ( int num : nums){
            if( num == elem )
                c++;
            else{ 
                c--;
                if( c==0){
                    c=1;
                    elem = num;
                }
            }
        }
        return elem;
    }
}