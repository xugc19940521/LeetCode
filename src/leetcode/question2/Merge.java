package leetcode.question2;

import java.util.Arrays;

/**
 * @CLassName Merge(88)
 * @Description �������������������� nums1 �� nums2���� nums2 �ϲ��� nums1 �У�ʹ�� num1 ��Ϊһ���������顣
 *              ��ʼ�� nums1 �� nums2 ��Ԫ�������ֱ�Ϊ m �� n��
 *              ����Լ��� nums1 ���㹻�Ŀռ䣨�ռ��С���ڻ���� m + n�������� nums2 �е�Ԫ�ء�
 *
 *               ���룺nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6],       n = 3
 *               �����[1,2,2,3,5,6]
 * @Author xugc
 * @Date 2019/12/31
 * @Version 1.0
 */
public class Merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m,j=0;i<=m+n-1;i++,j++){
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }

}
