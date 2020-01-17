package leetcode.question26;

/**
 * @CLassName FindNumbers(1295)
 * @Description 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
 *              输入：nums = [12,345,2,6,7896]
 *              输出：2
 * @Version 1.0
 */
public class FindNumbers {

    public static int findNumbers(int[] nums) {
        int result = 0;
        for(int i=0;i<nums.length;i++){
            String s = nums[i] + "";
            if(s.length()%2 == 0){
                result ++;
            }
        }
        return result;
    }
}
