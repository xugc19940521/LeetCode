package leetcode.question6;

/**
 * @CLassName ReverseWords(557)
 * @Description 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序
 *              输入: "Let's take LeetCode contest"
 *              输出："s'teL ekat edoCteeL tsetnoc"
 * @Author xugc
 * @Date 2018/9/30
 * @Version 1.0
 */
public class ReverseWords {
    public static String reverseWords(String s) {

        StringBuilder stringBuilder = new StringBuilder();
        String[] words = s.split(" ");
        for(int i=0;i<words.length;i++){
            stringBuilder.append(reverseString(words[i]));
            if(i!=words.length-1){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }


    public static String reverseString(String s) {

        StringBuilder stringBuilder = new StringBuilder();

        char[] characters = s.toCharArray();
        for(int i=characters.length-1;i>=0;i--){
            stringBuilder.append(characters[i]);
        }

        return stringBuilder.toString();
    }
}
