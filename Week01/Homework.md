// 两数之和
/*
 * 解法说明：
 * 1. 暴力求解； 时间复杂度为：O(n^2)
 * 2. Hash表求解；时间复杂度为：0(n)
 */

// 暴力求解：
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] result = new int[2];
//         for (int i = 0; i < nums.length - 1; i ++) {
//             for (int j = i + 1; j < nums.length; j ++) {
//                 if (nums[i] + nums[j] == target) {
//                     result[0] = i;
//                     result[1] = j;
//                     return result;
//                 }
//             }
//         }
//         return result;
//     }
// }

// // 暴力求解
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] result = new int[2];
//         for (int i = 0; i < nums.length - 1; i ++) {
//             for (int j = i + 1; j < nums.length; j ++) {
//                 if (nums[i] + nums[j] == target) {
//                     result[0] = i;
//                     result[1] = j;
//                     return result;
//                 }
//             }
//         }
//         return result;
//     }
// }

// Hash求解
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i ++) {
            numsMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i ++) {
            Integer component = target - nums[i];
            if (numsMap.containsKey(component) && numsMap.get(component) != i) {
                result[0] = i;
                result[1] = numsMap.get(component);
            }
        }
        return result;
    }
}