package leetcode.question18;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @CLassName BuddyStrings(859)
 * @Description ����������Сд��ĸ���ɵ��ַ��� A �� B ��
 *              ֻҪ���ǿ���ͨ������ A �е�������ĸ�õ��� B ��ȵĽ�����ͷ��� true �����򷵻� false ��

 *              ���룺A = "ab", B = "ba"
 *              �����true
 * @Version 1.0
 */
public class BuddyStrings {

    public static boolean buddyStrings(String A, String B) {
        int index = 0;
        HashMap<Character, Integer> m = new HashMap();
        if(A.length() != B.length()) return false;
        for(int i=0;i<A.length();i++){
            char achar = A.charAt(i);
            char bchar = B.charAt(i);
            if(achar != bchar){
                index++;
                if(index>2){
                    return false;
                }
            }else{
                if(m.containsKey(achar)){
                    int value = m.get(achar)+1;
                    m.put(achar, value);
                }else{
                    m.put(achar, 1);
                }
            }
        }
        if(index == 0){
            for(int i : m.values()){
                if(i>=2){
                    return true;
                }
            }
        }else if(index == 1){
            return false;
        }else if(index == 2){

            return true;
        }
        return false;
    }
}
