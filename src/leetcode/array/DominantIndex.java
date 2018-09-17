package leetcode.array;

import java.util.Arrays;

/**
 * @CLassName DominantIndex
 * @Description 在一个给定的数组nums中，总是存在一个最大元素 。
 *              查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
 *              如果是，则返回最大元素的索引，否则返回-1。
 *              输入: nums = [3, 6, 1, 0]
 *              输出: 1
 *              解释: 6是最大的整数, 对于数组中的其他整数,
 *              6大于数组中其他元素的两倍。6的索引是1, 所以我们返回1.
 * @Author xugc
 * @Date 2018/9/3 23:12
 * @Version 1.0
 */
public class DominantIndex {

    /** 提示:
     *  1.nums 的长度范围在[1, 50].
     *  2.每个 nums[i] 的整数范围在 [0, 99].
     */
    public static int dominantIndex(int[] nums) {
        int len = nums.length;
        if(len == 1)return 0;
        int[] copy = nums.clone();
        Arrays.sort(copy);
        if(copy[len-1]<copy[len-2]*2)return -1;
        for (int i=0;i<len;i++){
            if(nums[i] == copy[len-1]){
                return i;
            }
        }
        return -1;
    }
}
