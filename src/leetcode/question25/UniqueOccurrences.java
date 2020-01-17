package leetcode.question25;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @CLassName UniqueOccurrences(1207)
 * @Description 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
 *              如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
 *              输入：arr = [1,2,2,1,1,3]
 *              输出：true
 * @Version 1.0
 */
public class UniqueOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> result = new HashMap<>();
        for(int num : arr){
            if(result.containsKey(num)){
                int value = result.get(num);
                result.put(num, value+1);
            }else{
                result.put(num, 1);
            }
        }
        HashSet set = new HashSet(result.values());
        return result.keySet().size() == set.size();
    }
}
