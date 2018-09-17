package leetcode.array;

import java.util.Arrays;

/**
 * @CLassName SingleNumber
 * @Description 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *              你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * @Author xugc
 * @Date 2018/9/17 0:23
 * @Version 1.0
 */
public class SingleNumber {

    public static int singleNumber(int[] nums){
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);
        for(int i=0;i<(nums.length-1);i+=2){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
