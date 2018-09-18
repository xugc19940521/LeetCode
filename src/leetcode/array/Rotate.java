package leetcode.array;

/**
 * @CLassName Rotate
 * @Description 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *              尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 *              要求使用空间复杂度为 O(1) 的原地算法。
 *              输入: [1,2,3,4,5,6,7] 和 k = 3
 *              输出: [5,6,7,1,2,3,4]
 * @Author xugc
 * @Date 2018/9/17 22:01
 * @Version 1.0
 */
public class Rotate {

    public static void rotate(int[] nums, int k) {

        // [1,2,3,4,5,6,7]  ----> [1,2,3,1,5,6,7]   4
        int temp = nums[0];

        //0/3/6/2/5/1/4/0

        //6/2
        for(int i=nums.length-1;i==0;i=(i+3)%nums.length){
            nums[i+k] = temp;
            temp = nums[i+k];
        }
    }
}
