package leetcode.question6;

import java.util.Arrays;

/**
 * @CLassName ArrayPairSum(561)
 * @Description ��������Ϊ 2n ������, ��������ǽ���Щ���ֳ� n ��,
 *                  ���� (a1, b1), (a2, b2), ..., (an, bn) ��ʹ�ô�1 �� n �� min(ai, bi) �ܺ����
 *              ����: [1,4,3,2]
 *              ���: 4
 *              ����: n ���� 2, ����ܺ�Ϊ 4 = min(1, 2) + min(3, 4).
 *              ��ʾ:
 *                    n ��������,��Χ�� [1, 10000].
 *                    �����е�Ԫ�ط�Χ�� [-10000, 10000].
 * @Author xugc
 * @Date 2018/9/30
 * @Version 1.0
 */
public class ArrayPairSum {
    public static int arrayPairSum(int[] nums) {
        int maxValue = 0;
        Arrays.sort(nums);
        for(int i=0; i< nums.length;i+=2){
            maxValue += nums[i];
        }
        return maxValue;
    }
}
