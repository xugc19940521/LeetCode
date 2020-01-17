package leetcode.question3;

/**
 * @CLassName CountSegments(434)
 * @Description ����һ���ַ�������֤���Ƿ��ǻ��Ĵ���ֻ������ĸ�������ַ������Ժ�����ĸ�Ĵ�Сд��
 *              ˵���������У����ǽ����ַ�������Ϊ��Ч�Ļ��Ĵ���
 *              ���룺"A man, a plan, a canal: Panama"
 *              ����� true
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
