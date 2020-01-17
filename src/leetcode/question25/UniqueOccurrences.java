package leetcode.question25;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @CLassName UniqueOccurrences(1207)
 * @Description ����һ���������� arr�������æͳ��������ÿ�����ĳ��ִ�����
 *              ���ÿ�����ĳ��ִ������Ƕ�һ�޶��ģ��ͷ��� true�����򷵻� false��
 *              ���룺arr = [1,2,2,1,1,3]
 *              �����true
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
