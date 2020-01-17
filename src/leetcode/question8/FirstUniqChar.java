package leetcode.question8;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @CLassName FirstUniqChar(387)
 * @Description ����һ���ַ������ҵ����ĵ�һ�����ظ����ַ���������������������������ڣ��򷵻� -1
 *              �����Լٶ����ַ���ֻ����Сд��ĸ��
 *              ���룺s = "loveleetcode",
 *              �����2.
 * @Version 1.0
 */
public class FirstUniqChar {

    public static int firstUniqChar(String s) {
        Map<Character, Integer> m = new LinkedHashMap();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(m.containsKey(c)){
                m.replace(c, m.get(c)+1);
            }else{
                m.put(c, 1);
            }
        }
        char result = ' ';
        for(Map.Entry<Character, Integer> e : m.entrySet()){
            if(e.getValue() == 1){
                result = e.getKey();
                break;
            }
        }
        if(' ' != result){
            return s.indexOf(result);
        }
        return -1;
    }
}
