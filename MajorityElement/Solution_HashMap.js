/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let map = new Map();
    let majority_value = 0;
    let majority_key = 0;
    for(let i = 0 ; i < nums.length;i++){
        if(map.has(nums[i])){
            let placeHolder = map.get(nums[i])+1;
            map.set(nums[i],placeHolder);
        }
        else{
            map.set(nums[i],1);
        }
    }

    for(let [key,value] of map){
        if(majority_value < value){
            majority_value = value;
            majority_key = key;
        }
    }

    return majority_key;
        
};
