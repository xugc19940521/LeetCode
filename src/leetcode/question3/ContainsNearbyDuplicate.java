package leetcode.question3;

/**
 * @CLassName ContainsNearbyDuplicate(219)
 * @Description 给定一个整数数组和一个整数?k，判断数组中是否存在两个不同的索引?i?和?j，
 *              使得?nums [i] = nums [j]，并且 i 和 j?的差的绝对值最大为 k。
 *
 *               输入: nums = [1,2,3,1], k = 3
 *               输出: true
 * @Version 1.0
 */
public class ContainsNearbyDuplicate {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int j=k;j>0;j--){
            for(int i=0;i<nums.length-j;i++){
                if(nums[i] == nums[i+j]){
                    return true;
                }
            }
        }
        return false;
    }
}
