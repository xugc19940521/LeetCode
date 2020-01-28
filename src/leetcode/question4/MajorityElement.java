package leetcode.question4;

import java.util.Arrays;

/**
 * @CLassName MajorityElement(169)
 * @Description
 *               ����һ����СΪ n �����飬�ҵ����еĶ���Ԫ�ء�����Ԫ����ָ�������г��ִ�������?? n/2 ??��Ԫ�ء�
 *               ����Լ��������Ƿǿյģ����Ҹ������������Ǵ��ڶ���Ԫ�ء�
 *               ���룺[3,2,3]
 *               �����3
 * @Author xugc
 * @Date 2019/12/31
 * @Version 1.0
 */
public class MajorityElement {

    public static int majorityElement(int[] nums) {

        Arrays.sort(nums);

        return nums[nums.length/2];
    }
}
