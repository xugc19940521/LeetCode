package leetcode.question14;

/**
 * @CLassName DecompressRLElist(1323)
 * @Description 给你一个仅由数字 6 和 9 组成的正整数 num。
 *              你最多只能翻转一位数字，将 6 变成 9，或者把 9 变成 6 。
 *              请返回你可以得到的最大数字。
 *              输入：num = 9669
 *              输出：9969
 * @Author xugc
 * @Date 2020/2/9
 * @Version 1.0
 */
public class Maximum69Number {

    public static int maximum69Number (int num) {
        String str = String.valueOf(num);
        char[] c = str.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='6'){
                c[i] = '9';
                break;
            }
        }
        return Integer.parseInt(String.valueOf(c));
    }
}
