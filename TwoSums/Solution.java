import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                answer[1] = i;
                answer[0] = map.get(target - nums[i]);
                return answer;
            }
            map.put(nums[i], i);
        }
        return answer;
    }

}
