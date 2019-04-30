package leetcode.question20;

import java.util.Arrays;

/**
 * @CLassName SortedSquares(977)
 * @Description ����һ�����ǵݼ�˳��������������� A������ÿ�����ֵ�ƽ����ɵ������飬Ҫ��Ҳ���ǵݼ�˳������
 *              ���룺[-4,-1,0,3,10]
 *              �����[0,1,9,16,100]
 * @Author xugc
 * @Date 2019/2/25
 * @Version 1.0
 */
public class SortedSquares {
    public static int[] sortedSquares(int[] A) {
        int size = A.length;
        int[] B = new int[size];
        for(int i=0;i<size;i++){
            B[i] = A[i] * A[i];
        }
        Arrays.sort(B);
        return B;
    }
}
