package leetcode.question5;

import java.util.ArrayList;
import java.util.List;

/**
 * @CLassName FindDuplicates(442)
 * @Description  ����һ���������� a������1 �� a[i] �� n ��nΪ���鳤�ȣ�, ������ЩԪ�س������ζ�����Ԫ�س���һ�Ρ�
 *               �ҵ����г������ε�Ԫ�ء�
 *               ����Բ��õ��κζ���ռ䲢��O(n)ʱ�临�Ӷ��ڽ�����������
 *                  ���룺 [4,3,2,7,8,2,3,1]
 *                  ����� [2,3 ]
 * @Author xugc
 * @Date 2020/2/10
 * @Version 1.0
 */
public class FindDuplicates {

    public static List<Integer> FindDuplicates(int[] nums) {
        List<Integer> res = new ArrayList();
        int n = nums.length+1;
        int []temp = new int[n];
        for(int i = 0;i < temp.length;i++){
            temp[i] = 0;
        }
        for(int i = 0;i < n-1;i++){
            int number = nums[i];
            temp[number] += 1;
        }
        for(int i = 1;i < temp.length;i++){
            if(temp[i] == 2){
                res.add(i);
            }
        }
        return res;
    }
}
