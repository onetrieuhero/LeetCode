/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    let temp;
    
    for(let i = 0, j = 0 ; i < nums.length; i++){
        if(nums[i] !== 0){
            temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            j++
        }
    }

};
