package leetcode.question3;

/**
 * @CLassName AddDigits(258)
 * @Description     给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 *                  输入: 38
 *                  输出: 2
 *                  解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
 *                  进阶：你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？
 * @Author xugc
 * @Date 2018/10/1 9:11
 * @Version 1.0
 */
public class AddDigits {
    public static int addDigits(int num) {
        if(num==0)return 0;
        if(num%9==0)return 9;
        return num%9;
    }
}
