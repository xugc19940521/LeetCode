package leetcode.array;

/**
 * @CLassName RemoveDuplicates
 * @Description 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *              不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成
 * @Author xugc
 * @Date 2018/9/16 23:47
 * @Version 1.0
 */
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0)return 0;
        int temp = nums[0], j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != temp){
                nums[j] = nums[i];
                j++;
                temp = nums[i];
            }
        }
        return j;
    }
}
