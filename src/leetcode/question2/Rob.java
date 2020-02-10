package leetcode.question2;
/**
 * @CLassName Rob(198)
 * @Description ������һ��רҵ��С͵���ƻ�͵���ؽֵķ��ݡ�
 *              ÿ�䷿�ڶ�����һ�����ֽ�Ӱ����͵�Ե�Ψһ��Լ���ؾ������ڵķ���װ���໥��ͨ�ķ���ϵͳ��
 *              ����������ڵķ�����ͬһ���ϱ�С͵���룬ϵͳ���Զ�������
 *              ����һ������ÿ�����ݴ�Ž��ķǸ��������飬�������ڲ���������װ�õ�����£��ܹ�͵�Ե�����߽��
 *
 *               ���룺[2,7,9,3,1]
 *               �����12
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
