
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {
    let map = new Map();
    let newArray = [];
    for(let i = 0; i < nums.length; i++){
        map.set(nums[i]);
    }
    
    for(let i = 1 ; i <= nums.length; i++){
        if(!map.has(i)){
            newArray.push(i);
        }
    }
    
    return newArray;
};
