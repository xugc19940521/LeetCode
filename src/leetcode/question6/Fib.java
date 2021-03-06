package leetcode.question6;
/**
 * @CLassName Fib(509)
 * @Description 斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 *              F(0) = 0,   F(1) = 1
 *              F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 *              给定 N，计算 F(N)。
 *              输入：2
 *              输出：1
 *              解释：F(2) = F(1) + F(0) = 1 + 0 = 1.
 * @Author xugc
 * @Date 2019/5/20
 * @Version 1.0
 */
public class Fib {

    public static int fib(int N) {
        if(N == 0) return 0;
        if(N == 1) return 1;
        return fib(N-1)+fib(N-2);
    }
}
