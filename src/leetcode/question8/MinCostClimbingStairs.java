package leetcode.question8;

/**
 * @CLassName MinCostClimbingStairs(746)
 * @Description  �����ÿ��������Ϊһ�����ݣ��� i�����ݶ�Ӧ��һ���Ǹ�������������ֵ cost[i](������0��ʼ)��
 *               ע�⣺
 *                  ÿ��������һ�������㶼Ҫ���Ѷ�Ӧ����������ֵ��Ȼ�������ѡ�������һ�����ݻ�������������
 *                  ����Ҫ�ҵ��ﵽ¥�㶥������ͻ��ѡ��ڿ�ʼʱ�������ѡ�������Ϊ 0 �� 1 ��Ԫ����Ϊ��ʼ���ݡ�
 *               ���룺 cost = [10, 15, 20]
 *               ����� 15
 * @Author xugc
 * @Date 2019/12/25
 * @Version 1.0
 */
public class MinCostClimbingStairs {
    //�Ӻ���ǰ�ƣ� f[i] = cost[i]+ min(f[i+1], f[i+2])
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
