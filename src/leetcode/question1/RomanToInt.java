package leetcode.question1;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

/**
 * @CLassName RomanToInt(13)
 * @Description 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 *              字符          数值
 *              I             1
 *              V             5
 *              X             10
 *              L             50
 *              C             100
 *              D             500
 *              M             1000
 *              例如， 罗马数字 2 写做?II?，即为两个并列的 1。12 写做?XII?，即为?X?+?II?。 27 写做??XXVII, 即为?XX?+?V?+?II?。
 *              I?可以放在?V?(5) 和?X?(10) 的左边，来表示 4 和 9。
 *              X?可以放在?L?(50) 和?C?(100) 的左边，来表示 40 和?90。?
 *              C?可以放在?D?(500) 和?M?(1000) 的左边，来表示?400 和?900。
 *              给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
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
