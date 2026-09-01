
//         HashMap<Integer , Integer> map = new HashMap<>();
//         for ( int num : nums){
//             map.put( num , map.getOrDefault(num , 0) + 1);
//         }
//         PriorityQueue<Pair> pq = new PriorityQueue<>();
//         for ( int key : map.keySet()){
//             int freq = map.get(key);
//             pq.add(new Pair(key , freq));
//             if( pq.size() > k)
//                 pq.remove();
//         }
//         ArrayList<Integer> list = new ArrayList<>();
//         while(pq.size() > 0){
//             list.add(pq.remove().key);
//         }
//         Collections.reverse(list);
//         return list;
//     }
//     private int compareTo(Pair p){
//         if(this.freq == p.freq;)
//             return 
//         return this.freq - p.freq;
//     }
// }

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for ( int num : nums){
            map.put( num , map.getOrDefault(num , 0) + 1);
        }
        PriorityQueue<int []> pq = new PriorityQueue<>(
            (a,b) -> a[1] - b[1]
        ); 
        for( int key : map.keySet()){
            int freq = map.get(key);
            pq.add( new int[] {key , freq});
            if(pq.size() > k)
                pq.poll();
        }
        int arr[] = new int[k];
        for( int i = 0 ; i< k ; i++){
            arr[i] = pq.poll()[0];
        }
        return arr;
    }
}