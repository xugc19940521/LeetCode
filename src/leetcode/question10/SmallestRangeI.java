package leetcode.question10;

import java.util.Arrays;

/**
 * @CLassName SmallestRangeI(908)
 * @Description ����һ���������� A������ÿ������ A[i]�����ǿ���ѡ������ x ���� -K <= x <= K������ x �ӵ� A[i] �С�
 *              �ڴ˹���֮�����ǵõ�һЩ���� B��
 *              ���� B �����ֵ�� B ����Сֵ֮����ܴ��ڵ���С��ֵ��
 *              ���룺A = [0,10], K = 2
 *              �����6
 *              ���ͣ�B = [2,8]
 * @Author xugc
 * @Date 2018/9/28 0:11
 * @Version 1.0
 */

public class SmallestRangeI {

    public static int SmallestRangeI(int[] A, int K) {
        if(A.length == 0) return 0;
        Arrays.sort(A);
        int c = 0;
        int i=0;
        do{
            int left = A[i]+K ;
            int right = A[i+1]-K;
            c = (right - left)>0?(right - left):0;
        }while(i<A.length-1);

        return c;
    }
}
