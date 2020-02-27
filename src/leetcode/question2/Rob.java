package leetcode.question2;
/**
 * @CLassName Rob(198)
 * @Description 给你是一个专业的小偷，计划偷窃沿街的房屋。
 *              每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 *              如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *              给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额
 *
 *               输入：[2,7,9,3,1]
 *               输出：12
 * @Author xugc
 * @Date 2019/11/16
 * @Version 1.0
 */
public class Rob {

    public static int rob(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        sum[1] = Math.max(sum[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            sum[i] = Math.max(sum[i-1], sum[i-2]+nums[i]);
        }
        return sum[nums.length-1];
    }
}
