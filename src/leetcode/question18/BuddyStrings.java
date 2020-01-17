package leetcode.question18;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @CLassName BuddyStrings(859)
 * @Description 给定两个由小写字母构成的字符串 A 和 B ，
 *              只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。

 *              输入：A = "ab", B = "ba"
 *              输出：true
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
