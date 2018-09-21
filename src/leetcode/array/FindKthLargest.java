package leetcode.array;

/**
 * @CLassName FindKthLargest
 * @Description 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 *              输入：[3,2,1,5,6,4] 和 k = 2
 *              输出：5
 *              你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
 * @Author xugc
 * @Date 2018/9/21
 * @Version 1.0
 */
public class FindKthLargest {

    public static int findKthLargest(int[] nums, int k){
        if(nums.length==0)return 0;
        for (int i=nums.length-1; i>0; i--){
            for(int j=0;j<i; j++){
                if(nums[i]<nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            if(i == nums.length-k)break;
        }
        return nums[nums.length-k];
    }
}
