package leetcode.question8;

/**
 * @CLassName ToLowerCase(709)
 * @Description ʵ�ֺ��� ToLowerCase()���ú�������һ���ַ������� str���������ַ����еĴ�д��ĸת����Сд��ĸ��֮�󷵻��µ��ַ�����
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
