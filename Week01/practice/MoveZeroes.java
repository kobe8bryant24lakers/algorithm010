package com.algorithm.study.homework.week01;

/**
 * @ClassName MoveZeroes
 * @Description 算法训练营第一周作业：移动零
 * @Author 张银兵
 * @Date 2020/6/15 0:14
 * @Version 1.0
 **/
public class MoveZeroes {

    /**
     *@MethodName moveZeroes
     *@Author 张银兵 ybzhang@yinhai.com
     *@Description 遍历两次，时间复杂度：O(n)
     *@Date 2020/6/15 0:16
     *@Param [nums]
     *@return void
     **/
    public void moveZeroes(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != 0) {
                nums[idx ++] = nums[i];
            }
        }
        for (int i = idx; i < nums.length; i ++) {
            nums[i] = 0;
        }
    }

}
