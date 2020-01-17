package leetcode.question1;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

/**
 * @CLassName RomanToInt(13)
 * @Description �������ְ������������ַ�: I�� V�� X�� L��C��D �� M��
 *              �ַ�          ��ֵ
 *              I             1
 *              V             5
 *              X             10
 *              L             50
 *              C             100
 *              D             500
 *              M             1000
 *              ���磬 �������� 2 д��?II?����Ϊ�������е� 1��12 д��?XII?����Ϊ?X?+?II?�� 27 д��??XXVII, ��Ϊ?XX?+?V?+?II?��
 *              I?���Է���?V?(5) ��?X?(10) ����ߣ�����ʾ 4 �� 9��
 *              X?���Է���?L?(50) ��?C?(100) ����ߣ�����ʾ 40 ��?90��?
 *              C?���Է���?D?(500) ��?M?(1000) ����ߣ�����ʾ?400 ��?900��
 *              ����һ���������֣�����ת��������������ȷ���� 1 �� 3999 �ķ�Χ�ڡ�
 * @Version 1.0
 */
public class RomanToInt {
    public static int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> m = new HashMap();
        m.put('I', 1);m.put('V', 5);m.put('X', 10);m.put('L', 50);
        m.put('C', 100);m.put('D', 500);m.put('M', 1000);
        ArrayDeque<Character> stack = new ArrayDeque();
        for(int i=0; i<s.length(); i++){
            char t = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(t);
            }else{
                char c = stack.getLast();
                if(c=='I' && (t=='V' || t=='X')){
                    result += (t=='V'?4:9);
                    stack.clear();
                }else if(c=='X' && (t=='L' || t=='C')){
                    result += (t=='L'?40:90);
                    stack.clear();
                }else if(c=='C' && (t=='D' || t=='M')){
                    result += (t=='D'?400:900);
                    stack.clear();
                }else{
                    result += m.get(c);
                    stack.clear();
                    stack.push(t);
                }
            }
        }
        if(!stack.isEmpty()){
            result += m.get(stack.getLast());
        }
        return result;
    }
}
