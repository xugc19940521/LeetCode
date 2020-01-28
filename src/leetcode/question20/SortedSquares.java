package leetcode.question20;

import java.util.Arrays;

/**
 * @CLassName SortedSquares(977)
 * @Description 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 *              输入：[-4,-1,0,3,10]
 *              输出：[0,1,9,16,100]
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
