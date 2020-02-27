package leetcode.question8;

/**
 * @CLassName MinCostClimbingStairs(746)
 * @Description  数组的每个索引做为一个阶梯，第 i个阶梯对应着一个非负数的体力花费值 cost[i](索引从0开始)。
 *               注意：
 *                  每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯
 *                  您需要找到达到楼层顶部的最低花费。在开始时，你可以选择从索引为 0 或 1 的元素作为初始阶梯。
 *               输入： cost = [10, 15, 20]
 *               输出： 15
 * @Author xugc
 * @Date 2019/12/25
 * @Version 1.0
 */
public class MinCostClimbingStairs {
    //从后往前推， f[i] = cost[i]+ min(f[i+1], f[i+2])
    public static int minCostClimbingStairs(int[] cost) {
        int f1 = 0, f2 = 0;
        for (int i = cost.length - 1; i >= 0; --i) {
            int f0 = cost[i] + Math.min(f1, f2);
            f2 = f1;
            f1 = f0;
        }
        return Math.min(f1, f2);
    }
}
