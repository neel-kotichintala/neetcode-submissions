class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            for (int k = 1; k < numbers.length; k++)
            {
                if ((numbers[i] + numbers[k]) == target)
                {
                    return new int[] {i+1, k+1};
                }
            }
        }
        return new int[] {};
    }
}
