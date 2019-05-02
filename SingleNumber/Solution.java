class Solution {
    public int singleNumber(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
        int returnedValue = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.remove(nums[i]);
            }else{
                map.put(nums[i],i);
            }
        }
        for(int i : map.keySet())
            returnedValue = i;
        return returnedValue;
    }
}
