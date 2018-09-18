package leetcode.array;

/**
 * @CLassName RemoveElement
 * @Description 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 *              不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *              元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *              输入：nums = [3,2,2,3], val = 3
 *              输出：2
 * @Author xugc
 * @Date 2018/9/18
 * @Version 1.0
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int len = nums.length, i=-1;
        for(int j=0;j<len;j++){
            if(nums[j] != val){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
