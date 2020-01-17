package leetcode.question13;

import java.util.Arrays;

/**
 * @CLassName MaximumProduct(628)
 * @Description 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积
 *              说明：给定的整型数组长度范围是[3,104]，数组中所有的元素范围是[-1000, 1000]。
 *               输入的数组中任意三个数的乘积不会超出32位有符号整数的范围。
 * @Version 1.0
 */
public class MaximumProduct {
    public int maximumProduct(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        int length = nums.length;
        if(nums[length-1] == 0){
            return 0;
        }else if(nums[length-1] > 0){
            if(nums[0] * nums[1] > nums[length-2] * nums[length-3]) {
                max = nums[length-1] * nums[0] * nums[1];
            }else{
                max = nums[length-1] * nums[length-2] * nums[length-3];
            }
        }else if(nums[length-1] < 0){
             max = nums[length-1] * nums[length-2] * nums[length-3];
        }
        return max;
    }

}
