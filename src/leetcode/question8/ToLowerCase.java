package leetcode.question8;

/**
 * @CLassName ToLowerCase(709)
 * @Description 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 * @Author xugc
 * @Date 2018/9/27 23:57
 * @Version 1.0
 */
public class ToLowerCase {

    public static String toLowerCase(String str) {
        char[] character = str.toCharArray();
        for(int i=0;i<character.length;i++){
            if(character[i]>=65 && character[i]<97){
                character[i] += 32;
            }
        }

        return String.valueOf(character);
    }
}
