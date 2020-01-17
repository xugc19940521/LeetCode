package leetcode.question4;

/**
 * @CLassName FindPeakElement(162)
 * @Description 峰值元素是指其值大于左右相邻值的元素
 *              给定一个输入数组 nums，其中 nums[i] ≠ nums[i+1]，找到峰值元素并返回其索引。
 *              数组可能包含多个峰值，在这种情况下，返回任何一个峰值所在位置即可。
 *              你可以假设 nums[-1] = nums[n] = -∞。
 *              输入： nums = [1,2,3,1]
 *              输出： 2
 * @Version 1.0
 */
public class FindPeakElement {

    public static int findPeakElement(int[] nums) {
        int len = nums.length;
        if(len == 2)return nums[0]>nums[1]?0:1;
        int left = 0, right = len-1;
        while(left<right-1){
            int mid = (right-left)/2+left;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[mid]<nums[mid-1]){
                right = mid;
            }else if(nums[mid]<nums[mid+1]){
                left = mid;
            }
        }
        return nums[left]>nums[right]?left:right;
    }
}
