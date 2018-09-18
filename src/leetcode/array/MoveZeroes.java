package leetcode.array;

/**
 * @CLassName MoveZeroes
 * @Description 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序
 *              必须在原数组上操作，不能拷贝额外的数组。
 *              尽量减少操作次数。
 *              输入: [0,1,0,3,12]
 *              输出: [1,3,12,0,0]
 * @Author xugc
 * @Date 2018/9/17 23:12
 * @Version 1.0
 */
public class MoveZeroes {

    public static void moveZeroes(int[] nums){
        //如果数组长度为0或1，直接返回该数组
        if(nums.length<2)return;
        //从倒数第一个元素开始遍历
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]==0){
                //如果该元素==0，则后面所有元素都向前挪一位
                for(int j=i+1;j<nums.length;j++){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j] ;
                    nums[j] = temp;
                }
            }
        }
    }
}
