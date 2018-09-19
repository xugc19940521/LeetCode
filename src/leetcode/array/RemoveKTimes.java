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

    public static int  removeKTimes(int[] nums){
        int len = nums.length, j = 2;
        if(len<=2)return len;
        int temp = nums[0];
        for(int i=2;i<len;i++){//从第三个元素开始循环
            if((nums[i] != nums[i-1] || nums[i] != temp)){ //判断第i个元素 是否等于第i-1个元素和第i-2个元素
                temp = nums[i-1]; //缓存第i-2个元素
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
