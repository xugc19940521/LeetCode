package leetcode.question16;

import java.util.HashMap;
import java.util.Map;

/**
 * @CLassName NumJewelsInStones(771)
 * @Description  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *               J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 *               输入：J = "aA", S = "aAAbbbb"
 *               输出：3
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
