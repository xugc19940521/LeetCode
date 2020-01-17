package leetcode.question26;

/**
 * @CLassName SubtractProductAndSum(1281)
 * @Description 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 *              输入：n = 234
 *              输出：15
 * @Version 1.0
 */
public class SubtractProductAndSum {
    public static int subtractProductAndSum(int n) {
        int sum = 0 , product = 1;
        while(n>=10){
            int remainder = n%10;
            sum += remainder;
            product *= remainder;
            n = n/10;
        }
        sum += n;
        product *= n;
        return product-sum;
    }
}
