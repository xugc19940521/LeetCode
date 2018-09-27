package leetcode.question16;

import java.util.HashMap;
import java.util.Map;

/**
 * @CLassName NumJewelsInStones(771)
 * @Description  �����ַ���J ����ʯͷ�б�ʯ�����ͣ����ַ��� S������ӵ�е�ʯͷ�� S ��ÿ���ַ�������һ����ӵ�е�ʯͷ�����ͣ�����֪����ӵ�е�ʯͷ���ж����Ǳ�ʯ��
 *               J �е���ĸ���ظ���J �� S�е������ַ�������ĸ����ĸ���ִ�Сд�����"a"��"A"�ǲ�ͬ���͵�ʯͷ��
 *               ���룺J = "aA", S = "aAAbbbb"
 *               �����3
 * @Author xugc
 * @Date 2018/9/27 23:47
 * @Version 1.0
 */
public class NumJewelsInStones {

    public static int numJewelsInStones(String J, String S) {
        int result = 0;
        char[] jewels = J.toCharArray();
        char[] all = S.toCharArray();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<jewels.length;i++){
            map.put(jewels[i],0);
        }
        for(int i=0;i<all.length;i++){
            if(map.containsKey(all[i])){
                int num = map.get(all[i]) + 1;
                map.put(all[i],num);
            }
        }
        for(Character s:map.keySet()){
            result += map.get(s);
        }

        return result;
    }
}
