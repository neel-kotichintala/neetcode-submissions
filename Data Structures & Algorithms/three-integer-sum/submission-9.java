class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        }

        // -4, -1, -1, 0 , 1, 2

        Arrays.sort(nums);
        if (nums[0] > 0) {
            return new ArrayList<>();
        }

        List<List<Integer>> res  = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int num = nums[i];
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum =  num + nums[l] + nums[r];
                if (sum > 0) {
                    r--;
                    continue;
                }
                if (sum < 0) {
                    l++;
                    continue;
                }
                List<Integer> list = new ArrayList<>();
                list.add(num);
                list.add(nums[l]);
                list.add(nums[r]);
                res.add(list);
                l++;
                r--;
            }
        }

        return res;
    }
}
