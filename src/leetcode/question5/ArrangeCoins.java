package leetcode.question5;


/**
 * @CLassName ArrangeCoins(441)
 * @Description 你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。
 *              给定一个数字 n，找出可形成完整阶梯行的总行数。
 *              n 是一个非负整数，并且在32位有符号整型的范围内。
 *              输入：5
 *              输出：2
 * @Author xugc
 * @Date 2019/4/30 13:25
 * @Version 1.0
 */
public class ArrangeCoins {

    public static int arrangeCoins(int n){

        int i = 0;
        while(n>=i){
            n -= i;
            i++;
        }
        return i-1;
    }
}
