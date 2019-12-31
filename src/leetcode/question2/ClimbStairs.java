package leetcode.question2;

/**
 *@CLassName ClimbStairs(70)
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 * */

public class ClimbStairs {

    /**
     * 因为每步可以爬 1 或 2 个台阶，我们反过来思考
     * 台阶n 往后退1台阶： 台阶n-1； 退2台阶：台阶n-2
     * 所以台阶n = 台阶n-1 + 台阶n-2
     * */
    public static int climbStairs(int n){
        int[] a =  new int[n+1];
        a[0] = 1;
        a[1] = 1;
        for(int i=2;i<=n;i++){
           a[i] = a[i-1] + a[i-2];
        }
        return a[n];
    }
}
