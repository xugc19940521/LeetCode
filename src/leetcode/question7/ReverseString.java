package leetcode.question7;

/**
 * @CLassName ReverseString(344)
 * @Description  编写一个函数，其作用是将输入的字符串反转过来。
 *               输入："hello"
 *               输出："olleh"
 * @Author xugc
 * @Date 2018/9/30 7:15
 * @Version 1.0
 */
public class ReverseString {


    public static String ReverseString(String s) {

        StringBuilder stringBuilder = new StringBuilder();

        char[] characters = s.toCharArray();
        for(int i=characters.length-1;i>=0;i--){
            stringBuilder.append(characters[i]);
        }

        return stringBuilder.toString();
    }
}
