class Solution {
    public int hammingWeight(int n) {
        long mask = 1;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                count++;
            }
            mask *= 2;
        }
        return count;
    }
}


