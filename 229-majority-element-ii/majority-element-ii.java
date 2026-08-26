class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap< Integer, Integer> map = new HashMap<>();
        for( int num: nums){
            map.put( num , map.getOrDefault( num , 0) + 1);
        }
        for( int key : map.keySet()){
            if( map.get(key) > (nums.length/3))
                list.add(key);
        }
        return list;
    }
}