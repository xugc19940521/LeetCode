package leetcode.question8;

/**
 * @CLassName CanConstruct(383)
 * @Description 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，
 *              判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回 true ；否则返回 false
 *              你可以假设两个字符串均只含有小写字母。
 *              输入：canConstruct("a", "b") -> false
 *              输入：canConstruct("aa", "ab") -> false
 *              输入：canConstruct("aa", "aab") -> true
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
