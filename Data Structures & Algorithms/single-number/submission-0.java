class Solution {
    public int singleNumber(int[] nums) {
        int curr = 0;
        for (int num: nums) {
            curr = curr ^ num; 
        }
        return curr;
    }
}
