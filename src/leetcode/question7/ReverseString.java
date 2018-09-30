package leetcode.question7;

/**
 * @CLassName ReverseString(344)
 * @Description  ��дһ���������������ǽ�������ַ�����ת������
 *               ���룺"hello"
 *               �����"olleh"
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
