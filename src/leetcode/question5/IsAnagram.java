package leetcode.question5;

import java.util.HashMap;
import java.util.Map;

/**
 * @CLassName IsAnagram(242)
 * @Description  给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *               输入: "s = "anagram", t = "nagaram""
 *               输出: true
 * @Version 1.0
 */
public class IsAnagram {

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int len = s.length();
        Map<Character,Integer> map = new HashMap();
        for(int i=0;i<len;i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(map.containsKey(c1)){
                map.put(c1, map.get(c1)+1);
            }else{
                map.put(c1, 1);
            }
            if(map.containsKey(c2)){
                map.put(c2, map.get(c2)-1);
            }else{
                map.put(c2, -1);
            }
        }
        for(Map.Entry<Character, Integer> e : map.entrySet()){
            if(e.getValue() != 0){
                return false;
            }
        }
        return true;
    }
}
