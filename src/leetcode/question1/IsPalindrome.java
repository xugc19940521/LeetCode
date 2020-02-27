package leetcode.question1;

/**
 * @CLassName IsPalindrome(9)
 * @Description 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *              输入：121
 *              输出：true
 * @Author xugc
 * @Date 2019/4/23 22:05
 * @Version 1.0
 */
public class IsPalindrome {
    public static boolean isPalindrome(int x) {

        String sb = String.valueOf(x);
        for(int i=0, j=sb.length()-1;i<j;i++,j--){
            if((sb.charAt(i)) != (sb.charAt(j))){
                return false;
            }
        }
        return true;
    }
}
