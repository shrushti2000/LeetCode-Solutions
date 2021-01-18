/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {
    var sum=0;
    var sumArray=[];
    for (let i=0;i<nums.length;i++){
        sum=sum+nums[i]
        sumArray.push(sum)
    }
    return sumArray;
};
