package leetcode.question14;

/**
 * @CLassName SumZero(1304)
 * @Description 给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0 。
 *              输入：n = 5
 *              输出：[-7,-1,1,3,4]
 * @Author xugc
 * @Date 2020/2/9
 * @Version 1.0
 */
public class SumZero {

    public static int[] sumZero(int n) {
        int[] r = new int[n];
        if(n==1) {
            r =  new int[]{0};
        }
        for (int i = 0; i < n - 1; i++) {
            r[i] = i+1;
        }
        if (n-1>0){
            r[n - 1] = -n * (n - 1) / 2;
        }
        return r;
    }
}
