package leetcode.question4;

/**
 * @CLassName HammingDistance(461)
 * @Description 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 *              输入：x = 1, y = 4
 *              输出：2
 * @Author xugc
 * @Date 2020/2/27
 * @Version 1.0
 */
public class HammingDistance {

    public static int hammingDistance(int x, int y) {
        int count = 0;
        int t = x^y;
        while(t!=0){
            t = t & (t-1);
            count++;
        }
        return count;
    }
}
