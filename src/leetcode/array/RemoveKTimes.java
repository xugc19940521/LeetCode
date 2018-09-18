package leetcode.array;

/**
 * @CLassName RemoveKTimes
 * @Description 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
 *              不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成
 *              输入：[1,1,1,2,2,3]
 *              输出：5
 * @Author xugc
 * @Date 2018/9/18 19:47
 * @Version 1.0
 */

public class RemoveKTimes {

    public static int  RemoveKTimes(int[] nums, int k){
        int len = nums.length, j = 2;
        if(len<=2)return len;
        for(int i=2;i<len;i++){
            if(nums[i] != nums[i-1] || nums[i] != nums[i-2]){
                j++;
            }
        }
        return 0;
    }
}
