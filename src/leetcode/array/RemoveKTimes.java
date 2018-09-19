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

    public static int  removeKTimes(int[] nums){
        int len = nums.length, j = 2;
        if(len<=2)return len;
        int temp = nums[0];
        for(int i=2;i<len;i++){//�ӵ�����Ԫ�ؿ�ʼѭ��
            if((nums[i] != nums[i-1] || nums[i] != temp)){ //�жϵ�i��Ԫ�� �Ƿ���ڵ�i-1��Ԫ�غ͵�i-2��Ԫ��
                temp = nums[i-1]; //�����i-2��Ԫ��
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
