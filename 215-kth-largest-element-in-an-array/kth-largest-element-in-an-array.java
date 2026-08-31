class Solution1 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for( int i = 0 ; i < k ; i++){
            pq.add(nums[i]);
        }
        for( int j = k ; j< nums.length ; j++){
            if( pq.peek() < nums[j]){
                pq.poll();
                pq.add(nums[j]);
            }
        }
        return pq.peek();
    }
}