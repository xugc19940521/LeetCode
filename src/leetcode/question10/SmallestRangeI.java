package leetcode.question10;

import java.util.Arrays;

/**
 * @CLassName SmallestRangeI(908)
 * @Description 给定一个整数数组 A，对于每个整数 A[i]，我们可以选择任意 x 满足 -K <= x <= K，并将 x 加到 A[i] 中。
 *              在此过程之后，我们得到一些数组 B。
 *              返回 B 的最大值和 B 的最小值之间可能存在的最小差值。
 *              输入：A = [0,10], K = 2
 *              输出：6
 *              解释：B = [2,8]
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
