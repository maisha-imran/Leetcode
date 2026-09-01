class Solution {
    public int[][] kClosest(int[][] points, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            map.put(i, (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]));
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> b[1] - a[1]);

        for (int key : map.keySet()) {
            int dist = map.get(key);
            pq.add(new int[] { key, dist });
            if (pq.size() > k)
                pq.poll();
        }
        int arr[][] = new int[k][2];
        for (int j = 0; j < k; j++) {
            arr[j] = points[pq.poll()[0]];
        }
        return arr;
    }
}