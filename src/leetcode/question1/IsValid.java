package leetcode.question1;

import java.util.Stack;

/**
 *@CLassName IsValid(20)
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'?的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * */
public class IsValid {

    public static boolean isValid(String s) {
        if(s.length() == 0) return true;

        Stack stack = new Stack();

        for(int i=0; i<s.length();i++){
            char t = s.charAt(i);
            if(t == '(' || t == '{' || t == '['){
                stack.push(t);
            }else{
                if(stack.isEmpty())return false;
                char p = (Character) stack.pop();
                if(p == '(' &&  t == ')'){
                    continue;
                }else if(p == '{' &&  t == '}'){
                    continue;
                }else if(p == '[' &&  t == ']'){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
