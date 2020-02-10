package leetcode.question1;
/**
 * @CLassName MaxSubArray(53)
 * 给定一个整数数组?nums?，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释:?连续子数组?[4,-1,2,1] 的和最大，为?6。
 *
 * */


public class MaxSubArray {

    /**
     * 暴力解法
     * */
    public static int SubArray(int[] nums){
        if(nums.length==0){
            return 0;
        }

        for (int i=0;i<nums.length;i++){

        }

        return 0;
    }

    /**
     * 动态规划
     * */
    public static int maxSubArray2(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int sum_cur = nums[0];
        int sum_max = nums[0];
        //循环从第2个元素开始
        for(int i=1; i<nums.length;i++) {
            //
            if(sum_cur + nums[i] > nums[i] ) {
                sum_cur += nums[i] ;
            } else {
                sum_cur = nums[i] ;
            }
            sum_max = Math.max(sum_max , sum_cur);
        }
        return sum_max;
    }
}
