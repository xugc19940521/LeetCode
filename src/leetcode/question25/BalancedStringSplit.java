package leetcode.question25;

import java.util.Stack;

/**
 * @CLassName BalancedStringSplit(1221)
 * @Description 在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 *              给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 *              返回可以通过分割得到的平衡字符串的最大数量。
 *              输入：s = "RLRRLLRLRL"
 *              输出：4
 * @Version 1.0
 */
public class BalancedStringSplit {

    public static int balancedStringSplit(String s) {
        int result = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(c);
            }else{
                char first = stack.firstElement();
                if(c == first){
                    stack.push(c);
                }else{
                    stack.pop();
                    if(stack.isEmpty()){
                        result ++;
                    }
                }
            }
        }
        return result;
    }
}
