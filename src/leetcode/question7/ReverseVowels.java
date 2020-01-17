package leetcode.question7;

import java.util.HashSet;
import java.util.Set;

/**
 * @CLassName ReverseVowels(345)
 * @Description ��дһ�����������ַ�����Ϊ���룬��ת���ַ����е�Ԫ����ĸ��
 *              ���룺"leetcode",
 *              �����"leotcede"
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
