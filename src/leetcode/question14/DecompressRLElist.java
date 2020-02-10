package leetcode.question14;

import java.util.ArrayList;

/**
 * @CLassName DecompressRLElist(1313)
 * @Description ����һ�����г̳��ȱ���ѹ���������б�?nums?��
 *              ����ÿ�����ڵ�����Ԫ�� [a, b] = [nums[2*i], nums[2*i+1]]?������?i >= 0?����ÿһ�Զ���ʾ��ѹ���� a?��ֵΪ?b?��Ԫ�ء�
 *              ���㷵�ؽ�ѹ����б�
 *              ���룺nums = [1,2,3,4]
 *              �����[2,4,4,4]
 * @Author xugc
 * @Date 2020/2/9
 * @Version 1.0
 */
public class DecompressRLElist {

    public static int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++){
                a.add(nums[i+1]);
            }
        }
        int[] result = new int[a.size()];
        for(int i=0;i<a.size();i++){
            result[i] = a.get(i);
        }
        return result;
    }
}
