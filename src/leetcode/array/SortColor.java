package leetcode.array;

/**
 * @CLassName SortColor
 * @Description 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 *              此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 *              输入: [2,0,2,1,1,0]
 *              输出: [0,0,1,1,2,2]
 * @Author xugc
 * @Date 2018/9/19 23:09
 * @Version 1.0
 */
public class SortColor {
    // TODO: 2018/9/19 可以只用一次循环吗？
    public static void sortColor(int[] nums){
        //第一次移动所有的0，
        int index = 0, temp = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
        //第二次移动所有的2
        int index2 = nums.length-1;
        for(int i=nums.length-1;i>=index;i--){
            if(nums[i] == 2){
                temp = nums[i];
                nums[i] = nums[index2];
                nums[index2] = temp;
                index2--;
            }
        }
    }
}
