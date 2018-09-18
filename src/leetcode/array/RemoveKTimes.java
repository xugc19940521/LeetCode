package leetcode.array;

/**
 * @CLassName RemoveKTimes
 * @Description ����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ�����������Σ������Ƴ���������³��ȡ�
 *              ��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ�����������
 *              ���룺[1,1,1,2,2,3]
 *              �����5
 * @Author xugc
 * @Date 2018/9/18 19:47
 * @Version 1.0
 */

public class RemoveKTimes {

    public static int  RemoveKTimes(int[] nums, int k){
        int len = nums.length, j = 2;
        if(len<=2)return len;
        for(int i=2;i<len;i++){
            if(nums[i] != nums[i-1] || nums[i] != nums[i-2]){
                j++;
            }
        }
        return 0;
    }
}
