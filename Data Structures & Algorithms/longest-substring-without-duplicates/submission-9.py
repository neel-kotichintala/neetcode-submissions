class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        bum = set()
        l = 0
        result = 0

        for r in range(len(s)):
            while (s[r] in bum):
                bum.remove(s[l])
                l+=1
            bum.add(s[r])
            result = max(result, r-l+1)

        return result
