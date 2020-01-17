package leetcode.question8;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @CLassName FirstUniqChar(387)
 * @Description 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1
 *              您可以假定该字符串只包含小写字母。
 *              输入：s = "loveleetcode",
 *              输出：2.
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
