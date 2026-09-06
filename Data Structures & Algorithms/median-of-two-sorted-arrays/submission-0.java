class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int len = nums1.length + nums2.length;
        int half = (len + 1) / 2;

        int l = 0;
        int r = nums1.length;

        if (len == 0) {
            return 0.0;
        }

        if (len == 1) {
            if (nums1.length == 1) {
                return (double) nums1[0];
            } else {
                return (double) nums2[0];
            }
        }

        while (l <= r) {
            int m = (r+l) / 2;

            int leftPart1 = m; // rightmost index in left partition of nums1, always m
            int leftPart2 = half - leftPart1; // // right most index in left partition of nums2

            int leftVal1 = (leftPart1 == 0) ? Integer.MIN_VALUE : nums1[leftPart1 - 1];
            int rightFirst1 = (leftPart1 == nums1.length) ? Integer.MAX_VALUE : nums1[leftPart1];

            int leftVal2 = (leftPart2 == 0) ? Integer.MIN_VALUE : nums2[leftPart2 - 1];
            int rightFirst2 = (leftPart2 == nums2.length) ? Integer.MAX_VALUE : nums2[leftPart2];
            
            if (leftVal1 <= rightFirst2 && leftVal2 <= rightFirst1) {
                if (len % 2 == 0) {
                    int left = Math.max(leftVal1, leftVal2);
                    int right = Math.min(rightFirst1, rightFirst2);
                    double median = ((double) (left + right)) / 2.0;
                    return median;
                } else {
                    double median = Math.max(leftVal1, leftVal2);
                    return median;
                }
            } else if (leftVal1 > rightFirst2) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return 0.0;
    }
}
