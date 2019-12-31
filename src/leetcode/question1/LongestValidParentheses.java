package leetcode.question1;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @CLassName LongestValidParentheses(32)
 * @Description  给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
 *               输入: ")()())"
 *               输出: 4
 *               解释: 最长有效括号子串为 "()()"
 * @Version 1.0
 */
public class LongestValidParentheses {

    public static int longestValidParentheses(String s){
        int maxResult = 0;
        Stack stack = new Stack();
        for(int i=0;i<s.length();i++){
            char t = s.charAt(i);
            Map<String, Object> m = new HashMap();
            m.put("index", i);
            m.put("value", t);
            if(t == ')'){
                if(stack.isEmpty()){
                    stack.push(m);
                }else{
                    if((Character)((Map) stack.peek()).get("value") != '('){
                        stack.push(m);
                    }else{
                        stack.pop();
                    }
                }
            }else{
                stack.push(m);
            }
        }
        if(stack.isEmpty()){
            return s.length();
        }else{
            Object[] objects =  stack.toArray();
            int lastIndex = -1;
            for(int i=0;i<objects.length;i++){
                Map m = (Map)objects[i];
                int index = (Integer) m.get("index");
                maxResult = Math.max(maxResult,index-lastIndex-1);
                lastIndex = index;
            }
            maxResult = Math.max(maxResult,s.length()-1-lastIndex);
        }
        return maxResult;
    }
}
