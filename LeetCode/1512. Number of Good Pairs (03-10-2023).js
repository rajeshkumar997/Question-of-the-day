/**
 * @param {number[]} nums
 * @return {number}
 */
var numIdenticalPairs = function(nums) {
    let ans = 0;
    const arr = {};
    for(let x of nums){
        ans += arr[x] || 0;
        arr[x] = (arr[x] || 0) + 1;
    }
    return ans;
};
