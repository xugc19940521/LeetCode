package leetcode.question7;

import java.util.HashSet;
import java.util.Set;

/**
 * @CLassName ReverseVowels(345)
 * @Description 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 *              输入："leetcode",
 *              输出："leotcede"
 * @Version 1.0
 */
public class ReverseVowels {

    public static String reverseVowels(String s) {
        char[] result = new char[s.length()];

        Set m = new HashSet<>();
        m.add('a'); m.add('e'); m.add('i'); m.add('o'); m.add('u');
        int i=0, j=s.length()-1;
        while(i<=j){
            char before = s.charAt(i);
            char after = s.charAt(j);
            if(!m.contains(before)){
                result[i] = before;
                i++;
            }else if(!m.contains(after)){
                result[j] = after;
                j--;
            }else{
                result[i] = after;
                result[j] = before;
                i++;
                j--;
            }
        }
        return new String(result);

    }
}
