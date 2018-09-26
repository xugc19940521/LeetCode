package leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @CLassName InterSection
 * @Description     �����������飬��дһ���������������ǵĽ���
 *                  ���룺nums1 = [1,2,2,1], nums2 = [2,2]
 *                  �����[2]
 * @Author xugc
 * @Date 2018/9/26 23:00
 * @Version 1.0
 */
public class InterSection {
    /**
     * @method  intersection
     * @description ����һ�·���������
     * @author: xugc
     * @param nums1 ��һ������
     * @param nums2 �ڶ�������
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
