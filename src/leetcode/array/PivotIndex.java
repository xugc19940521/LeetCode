package leetcode.array;

/**
 * @CLassName PivotIndex
 * @Description  给定一个整数类型的数组 nums，请编写一个能够返回数组“中心索引”的方法
 *               我们是这样定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
 *               如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
 *               输入:
 *                     nums = [1, 7, 3, 6, 5, 6]
 *               输出: 3
 *
 * @Author xugc
 * @Date 2018/9/3 23:08
 * @Version 1.0
 */
public class PivotIndex {


   /** 提示:
    *  1.nums 的长度范围为 [0, 10000]。
    *  2.任何一个 nums[i] 将会是一个范围在 [-1000, 1000]的整数
    */
    public static int pivotIndex(int[] nums) {
        if(nums.length==0){
            return -1;
        }
        int sum = 0, sumleft = 0;
        for(int i=0,len=nums.length;i<len;i++){
            sum += nums[i];
        }
        if(sum-nums[0]==0){
            return 0;
        }
        for(int i=0,len=nums.length;i<len-1;i++){
            sumleft += nums[i];
            if(sum-nums[i+1] == sumleft*2){
                return i+1;
            }
        }
        return -1;
    }
}
