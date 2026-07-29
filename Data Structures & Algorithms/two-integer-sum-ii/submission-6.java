class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
   // -4, -3, -2, -1
        while (l < r) {
            int num_r = numbers[r];
            int num_l = numbers[l];
            if (num_l + num_r < target) {
                l++;
                continue;
            }
            if (num_l + num_r > target) {
                r--;
                continue;
            }
            break;
        }
        
        return new int[] {l+1, r+1};
    }
}
