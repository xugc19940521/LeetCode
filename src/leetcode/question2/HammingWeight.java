package leetcode.question2;

/**
 * @CLassName HammingWeight(191)
 * @Description 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。。
 *              输入：x = 00000000000000000000000000001011
 *              输出：3
 * @Author xugc
 * @Date 2020/2/27
 * @Version 1.0
 */
public class HammingWeight {

    public static int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
