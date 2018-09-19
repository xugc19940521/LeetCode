package leetcode.array;

/**
 * @CLassName SortColor
 * @Description ����һ��������ɫ����ɫ����ɫ��һ�� n ��Ԫ�ص����飬ԭ�ض����ǽ�������ʹ����ͬ��ɫ��Ԫ�����ڣ������պ�ɫ����ɫ����ɫ˳�����С�
 *              �����У�����ʹ������ 0�� 1 �� 2 �ֱ��ʾ��ɫ����ɫ����ɫ��
 *              ����: [2,0,2,1,1,0]
 *              ���: [0,0,1,1,2,2]
 * @Author xugc
 * @Date 2018/9/19 23:09
 * @Version 1.0
 */
public class SortColor {
    // TODO: 2018/9/19 ����ֻ��һ��ѭ����
    public static void sortColor(int[] nums){
        //��һ���ƶ����е�0��
        int index = 0, temp = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
        //�ڶ����ƶ����е�2
        int index2 = nums.length-1;
        for(int i=nums.length-1;i>=index;i--){
            if(nums[i] == 2){
                temp = nums[i];
                nums[i] = nums[index2];
                nums[index2] = temp;
                index2--;
            }
        }
    }
}
