class Solution {
    public int[] twoSum(int[] numbers, int target) {
            int curSum = 0; 
            int r = numbers.length-1;
            int l = 0;

            while (l < r)
            {
                if (numbers[l] + numbers[r] == target)
                {
                    return new int[] {numbers[l], numbers[r]};
                }
                else if (numbers[l] + numbers[r] > target)
                {
                    r--;
                }
                else
                {
                    l++;
                }
            }
            return new int[] {};
    }
}
