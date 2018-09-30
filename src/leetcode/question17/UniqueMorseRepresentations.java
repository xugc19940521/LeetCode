package leetcode.question17;

import java.util.HashMap;
import java.util.Map;

/**
 * @CLassName NniqueMorseRepresentations(804)
 * @Description ����Ħ��˹���붨��һ�ֱ�׼���뷽ʽ����ÿ����ĸ��Ӧ��һ����һϵ�е�Ͷ�����ɵ��ַ����� ����: "a" ��Ӧ ".-", "b" ��Ӧ "-...", "c" ��Ӧ "-.-.", �ȵ�
 *              ����һ�������б�ÿ�����ʿ���д��ÿ����ĸ��ӦĦ��˹�������ϡ����磬"cab" ����д�� "-.-.-....-"��(�� "-.-." + "-..." + ".-"�ַ����Ľ��)��
 *              ���ǽ�����һ�����ӹ��̳������ʷ��롣
 *              �������ǿ��Ի�����дʲ�ͬ���ʷ����������
 *              ���룺words = ["gin", "zen", "gig", "msg"]
 *              �����2
 * @Author xugc
 * @Date 2018/9/28 0:11
 * @Version 1.0
 */

public class UniqueMorseRepresentations {

    public static int uniqueMorseRepresentations(String[] words) {

        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map result = new HashMap();
        for(int i=0;i<words.length;i++){
            StringBuffer stringBuffer = new StringBuffer();

            char[] chars = words[i].toCharArray();
            for(int j=0;j<chars.length;j++){
                stringBuffer.append(codes[chars[j]-97]);
            }
            result.put(stringBuffer.toString(),0);
        }

        return result.size();
    }
}
