package leetcode.question2;
/**
 *@CLassName LengthOfLastWord(58)
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 *
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 * */
public class LengthOfLastWord {


    public static int lengthOfLastWord(String s){
        int len = s.length();
        int result = 0;
        for(int i=len-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                result ++;
            }else{
                if(result!=0){
                    break;
                }
            }
        }
        return result;

    }
}
