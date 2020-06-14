package com.algorithm.study.homework.week01;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TwoSum
 * @Description 算法训练营第一周作业：两数之和
 * @Author 张银兵
 * @Date 2020/6/14 23:52
 * @Version 1.0
 **/
public class TwoSum {

    /**
     *@MethodName twoSum
     *@Author 张银兵
     *@Description 暴力求解； 时间复杂度为：O(n^2)
     *@Date 2020/6/14 23:56
     *@Param [nums, target]
     *@return int[]
     **/
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i ++) {
            for (int j = i + 1; j < nums.length; j ++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    /**
     *@MethodName twoSum
     *@Author 张银兵
     *@Description Hash表求解；时间复杂度为：0(n)
     *@Date 2020/6/14 23:54
     *@Param [nums, target]
     *@return int[]
     **/
    public int[] twoSumHash(int[] nums, int target) {
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
