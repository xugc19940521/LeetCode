package leetcode.question1;

/**
 * @CLassName ReverseString(344)
 * @Description  编写一个函数来查找字符串数组中的最长公共前缀。
 *               如果不存在公共前缀，返回空字符串 ""。
 * @Version 1.0
 */
public class LongestCommonPrefix {

    public static String LongestCommonPrefix(String[] strs){
        if(strs.length == 0) return "";
        String prefix = strs[0];
        for(int i=1; i<strs.length;i++){
            prefix = CommonPrefix(prefix,strs[i]);
        }
        return prefix;
    }


    public static String CommonPrefix(String str1, String str2){
        StringBuffer sbf = new StringBuffer();
        for(int i=0;i<str1.length();i++){
            if(i>=str2.length()){
                break;
            }
            if(str1.charAt(i) == str2.charAt(i)){
                sbf.append(str1.charAt(i));
            }else{
                break;
            }
        }
        return sbf.toString();
    }
}
