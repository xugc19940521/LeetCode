package leetcode.question4;

/**
 * @CLassName IsSubsequence(392)
 * @Description  给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 *               注意：
 *                  你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。
 *                  字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 *               输入： s = "abc", t = "ahbgdc"
 *               输出： true
 * @Author xugc
 * @Date 2019/12/25
 * @Version 1.0
 */
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if(sLen > tLen) return false;
        if(sLen == 0) return true;
        boolean[][] d = new boolean[sLen+1][tLen+1];
        for(int i=0;i<=tLen;i++){
            d[0][i] = true;
        }
        for(int i=1;i<=sLen;i++){
            for(int j=1;j<=tLen; j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    d[i][j] = d[i-1][j-1];
                }else{
                    d[i][j] = d[i][j-1];
                }
            }
        }
        return d[sLen][tLen];
    }


}
