class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> b - a
        );
        for( int stone : stones){
            pq.add(stone);
        }
        while( pq.size() > 1){
            int val1 = pq.poll();
            int val2 = pq.poll();
            if( val1 - val2 != 0)
                pq.add( val1 - val2);
        }

        return (pq.size() == 0 )? 0 : pq.poll();
    }
}