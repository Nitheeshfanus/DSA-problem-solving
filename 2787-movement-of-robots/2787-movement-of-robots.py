class Solution:
    def sumDistance(self, nums: List[int], s: str, d: int) -> int:
        mod=7+10**9
        for i in range(len(nums)):
            if s[i] == "R":
                nums[i] +=d
            else:
                nums[i] -=d
        nums.sort()
        prefix=[nums[0]]
        for i in range(1,len(nums)):
            prefix.append(prefix[-1]+nums[i])
        sum=0
        for i in range(len(nums)):
            n=len(prefix)-i-1
            sum+=prefix[-1]-(n*nums[i]+prefix[i])
            sum%=mod
        return sum