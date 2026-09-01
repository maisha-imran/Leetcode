class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<int []> pq = new PriorityQueue<>(
            (a,b) ->  b[1] - a[1]
        ); 
        HashMap<Character , Integer> map = new HashMap<>();
        for( char ch : tasks){
            map.put( ch , map.getOrDefault(ch , 0)+1);
        }
        for( char key : map.keySet()){
            int freq = map.get(key);
            pq.add( new int[]{ key , freq });
        }
        int interval = 0;
        Queue< int []> q = new LinkedList<>();
        while( pq.size() > 0 || (!q.isEmpty())){
            if( pq.size() > 0){
                int [] arr = pq.poll();
                arr[1]--;
                if(arr[1] > 0)
                    q.offer(new int[]{arr[0], arr[1], interval + n + 1});
            }

            if (!q.isEmpty() && q.peek()[2] == interval + 1) {
                pq.offer(q.poll());
            }

            interval ++;
        }
        return interval;
    }
}