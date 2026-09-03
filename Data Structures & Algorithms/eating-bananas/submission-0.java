class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         // possible eatings rates will be from 1 to max(piles)
         // use binary search on the eating rates array
         // if current eating rate works go to left half
         // if current eating rate doesnt work, go to right half
        
        int max = 0;
        for (int pile: piles) {
            if (pile > max) {
                max = pile;
            }
        }

        int l = 1;
        int r = max;

        int min = 1;

        while (l <= r) {
            int m = (r + l) / 2;

            int time = 0;
            for (int pile: piles) {
                time += Math.ceilDiv(pile, m);
            }

            if (time <= h) {
                r = m - 1;
                min = m;
            } else {
                l = m + 1;
            }
        }

        return min;
    }
}
