package leetcode.question8;

/**
 * @CLassName CanConstruct(383)
 * @Description ����һ������� (ransom) �ַ�����һ����־(magazine)�ַ�����
 *              �жϵ�һ���ַ���ransom�ܲ����ɵڶ����ַ���magazines������ַ����ɡ�������Թ��ɣ����� true �����򷵻� false
 *              ����Լ��������ַ�����ֻ����Сд��ĸ��
 *              ���룺canConstruct("a", "b") -> false
 *              ���룺canConstruct("aa", "ab") -> false
 *              ���룺canConstruct("aa", "aab") -> true
 * @Version 1.0
 */
public class CanConstruct {

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] t = new int[26];
        for(int i=0;i<ransomNote.length();i++){
            t[ransomNote.charAt(i)-'a'] ++;
        }

        for(int i=0;i<magazine.length();i++){
            t[magazine.charAt(i)-'a'] --;
        }

        for(int i=0;i<t.length;i++){
            if(t[i] > 0){
                return false;
            }
        }
        return true;
    }
}
