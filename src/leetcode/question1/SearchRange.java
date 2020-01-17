package leetcode.question1;


/**
 * @CLassName SearchRange(34)
 * @Description 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *              你的算法时间复杂度必须是 O(log n) 级别。
 *
 *              输入： nums = [5,7,7,8,8,10], target = 8
 *              输出： [3,4]
 * @Version 1.0
 */
public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        int length = nums.length;
        if(nums.length==0) return result;
        //找开始位置
        int left = 0, right = length-1;
        while(left<right-1){
            int mid = (right-left)/2 + left;
            if(nums[mid] >= target){
                right = mid;
            }else{
                left = mid;
            }
        }
        if(nums[left] == target){
            result[0] = left;
        }else if(nums[right] == target){
            result[0] = right;
        }

       //找结束位置
       left = 0; right = length-1;
        while(left<right-1){
            int mid = (right-left)/2 + left;
            if(nums[mid] <= target){
                left = mid;
            }else{
                right = mid;
            }
        }
        if(nums[right] == target){
            result[1] = right;
        }else if(nums[left] == target){
            result[1] = left;
        }
        return result;
    }

}
