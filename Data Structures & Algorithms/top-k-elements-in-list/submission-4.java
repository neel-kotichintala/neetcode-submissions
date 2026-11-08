class Solution {

    class Node {
        int num;
        int freq;

        public Node(int num, int freq) {
            this.num = num;
            this.freq = freq;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        // max heap that sorts based on the freq
        PriorityQueue<Node> maxHeap = new PriorityQueue<>(Comparator.comparingInt((Node n) -> n.freq).reversed());
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Node node = new Node(entry.getKey(), entry.getValue());
            maxHeap.offer(node);
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            Node node = maxHeap.poll();
            res[i] = node.num;
        }

        return res;
    }
}
