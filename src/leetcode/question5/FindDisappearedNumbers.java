package leetcode.question5;

import java.util.ArrayList;
import java.util.List;

/**
 * @CLassName FindDisappearedNumbers(448)
 * @Description  ����һ����Χ��  1 �� a[i] �� n ( n = �����С ) �� �������飬�����е�Ԫ��һЩ���������Σ���һЩֻ����һ�Ρ�
 *               �ҵ������� [1, n] ��Χ֮��û�г����������е����֡�
 *                  �����ڲ�ʹ�ö���ռ���ʱ�临�Ӷ�ΪO(n)�������������������? ����Լٶ����ص����鲻���ڶ���ռ��ڡ�
 *                  ���룺 [4,3,2,7,8,2,3,1]
 *                  ����� [5,6]
 * @Author xugc
 * @Date 2020/2/10
 * @Version 1.0
 */
public class FindDisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList();
        int n = nums.length+1;
        int []temp = new int[n];
        for(int i = 0;i < temp.length;i++){
            temp[i] = 0;
        }
        for(int i = 0;i < n-1;i++){
            int number = nums[i];
            temp[number] = 1;
        }
        for(int i = 1;i < temp.length;i++){
            if(temp[i] == 0){
                res.add(i);
            }
        }
        return res;
    }
}
