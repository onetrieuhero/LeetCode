class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        maps = {}
        for i in range(len(nums)):
            temp_value = target - nums[i]
            if(temp_value in maps):
                return [maps[temp_value], i]
            else:
                maps[nums[i]] = i
