class Solution {
    public int[] countBits(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[n+1];
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                count = 0;
            }
            else if (i % 2 == 0) {
                count = map.get(i/2);
            }
            else {
                count = map.get(i-1) + 1;
            }
            res[i] = count;
            map.put(i, count);
        }
        return res;
    }
}