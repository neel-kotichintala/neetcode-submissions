class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // -4, -1, -1, 0, 1, 2
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
    
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] > 0)
            {
                break;
            }
            if (i > 0 && (nums[i] == nums[i-1]))
            {
                continue;
            }
            int first = nums[i];
            int l = i+1;
            int r = nums.length-1;

            while (l < r)
            {
                if ((first + nums[l] + nums[r]) == 0)
                { 
                    res.add(Arrays.asList(first, nums[l], nums[r]));
                    r--;
                    l++;
                    
                    while ((nums[l] == nums[l-1]) && (nums[r] == nums[r+1]) && (l < r))
                    {
                        r--;
                        l++;
                    }
                    
                }
                else if ((first + nums[l] + nums[r]) > 0)
                {
                    r--;
                }
                else
                {
                    l++;
                }
            }

            
        }
        return res;
    }
}
