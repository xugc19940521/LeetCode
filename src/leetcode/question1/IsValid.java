package leetcode.question1;

import java.util.Stack;

/**
 *@CLassName IsValid(20)
 * ����һ��ֻ���� '('��')'��'{'��'}'��'['��']'?���ַ������ж��ַ����Ƿ���Ч��
 *
 * ��Ч�ַ��������㣺
 *
 * �����ű�������ͬ���͵������űպϡ�
 * �����ű�������ȷ��˳��պϡ�
 * ע����ַ����ɱ���Ϊ����Ч�ַ�����
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
