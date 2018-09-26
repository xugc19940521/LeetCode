package leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @CLassName InterSection
 * @Description     给定两个数组，编写一个函数来计算它们的交集
 *                  输入：nums1 = [1,2,2,1], nums2 = [2,2]
 *                  输出：[2]
 * @Author xugc
 * @Date 2018/9/26 23:00
 * @Version 1.0
 */
public class InterSection {
    /**
     * @method  intersection
     * @description 描述一下方法的作用
     * @author: xugc
     * @param nums1 第一个数组
     * @param nums2 第二个数组
     * @return
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;

        Map<Integer,Object> result = new HashMap<Integer,Object>();
        Map<Integer,Object> map = new HashMap<Integer,Object>();
        for(int i=0;i<len1;i++){
            map.put(nums1[i],0);
        }

        for(int i=0;i<len2;i++){
            if(map.containsKey(nums2[i])){
                result.put(nums2[i],0);
            }
        }
        int[] resultArray = new int[result.size()];
        int i = 0;
        for(Map.Entry<Integer, Object> entry : result.entrySet()){
            resultArray[i] = entry.getKey().intValue();
            i++;
        }

        return resultArray;
    }
}
