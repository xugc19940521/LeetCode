package leetcode.question3;

/**
 * @CLassName CountSegments(434)
 * @Description 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *              说明：本题中，我们将空字符串定义为有效的回文串。
 *              输入："A man, a plan, a canal: Panama"
 *              输出： true
 * @Version 1.0
 */
public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        if("".equals(s))return true;
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuffer a = new StringBuffer();
        for(int i=0;i<s.length();i++){
            a.append(s.charAt(i));
        }
        return s.equals(a.reverse().toString());
    }
}
