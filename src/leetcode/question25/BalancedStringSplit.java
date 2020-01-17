package leetcode.question25;

import java.util.Stack;

/**
 * @CLassName BalancedStringSplit(1221)
 * @Description ��һ����ƽ���ַ������У�'L' �� 'R' �ַ�����������ͬ�ġ�
 *              ����һ��ƽ���ַ��� s�����㽫���ָ�ɾ����ܶ��ƽ���ַ�����
 *              ���ؿ���ͨ���ָ�õ���ƽ���ַ��������������
 *              ���룺s = "RLRRLLRLRL"
 *              �����4
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
