package leetcode.question5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

/**
 * @CLassName ThirdMax(414)
 * @Description ����һ���ǿ����飬���ش������е������������������ڣ��򷵻���������������Ҫ���㷨ʱ�临�Ӷȱ�����O(n)��
 *
 *               ����: [3, 2, 1]
 *               ���: 1
 *               ����: ����������� 1.
 * @Version 1.0
 */
public class ThirdMax {

    public static int thirdMax(int[] nums) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE ;
        Set s = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
            int temp = nums[i];
            if (temp > first){
                third = second;
                second = first;
                first = temp;
            }else if(temp == first){
                continue;
            }else{
                if(temp>second){
                    third = second;
                    second = temp;
                }else if(temp == second){
                    continue;
                }else{
                    if(temp>third){
                        third = temp;
                    }
                }
            }
        }
        return s.size()>=3?third:first;
    }
}
