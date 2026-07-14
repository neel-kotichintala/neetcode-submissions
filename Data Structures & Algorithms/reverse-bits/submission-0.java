class Solution {
    public int reverseBits(int n) {
        int mask = 1;
        int res = 0;
        for (int i = 0; i <= 31; i++) {
            if ((n & mask) == 1) {
                res |= (1 << (31 - i));
            }
            n = n >>> 1;
        }

        return res;
    }
}
