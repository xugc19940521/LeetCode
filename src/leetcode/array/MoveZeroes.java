package leetcode.array;

/**
 * @CLassName MoveZeroes
 * @Description ����һ������ nums����дһ������������ 0 �ƶ��������ĩβ��ͬʱ���ַ���Ԫ�ص����˳��
 *              ������ԭ�����ϲ��������ܿ�����������顣
 *              �������ٲ���������
 *              ����: [0,1,0,3,12]
 *              ���: [1,3,12,0,0]
 * @Author xugc
 * @Date 2018/9/17 23:12
 * @Version 1.0
 */
public class MoveZeroes {

    public static void moveZeroes(int[] nums){
        //������鳤��Ϊ0��1��ֱ�ӷ��ظ�����
        if(nums.length<2)return;
        //�ӵ�����һ��Ԫ�ؿ�ʼ����
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]==0){
                //�����Ԫ��==0�����������Ԫ�ض���ǰŲһλ
                for(int j=i+1;j<nums.length;j++){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j] ;
                    nums[j] = temp;
                }
            }
        }
    }
}
