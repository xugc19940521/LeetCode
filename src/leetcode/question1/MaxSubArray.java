package leetcode.question1;
/**
 * @CLassName MaxSubArray(53)
 * ����һ����������?nums?���ҵ�һ���������͵����������飨���������ٰ���һ��Ԫ�أ������������͡�
 *
 * ʾ��:
 *
 * ����: [-2,1,-3,4,-1,2,1,-5,4],
 * ���: 6
 * ����:?����������?[4,-1,2,1] �ĺ����Ϊ?6��
 *
 * */


public class MaxSubArray {

    /**
     * �����ⷨ
     * */
    public static int SubArray(int[] nums){
        if(nums.length==0){
            return 0;
        }

        for (int i=0;i<nums.length;i++){

        }

        return 0;
    }

    /**
     * ��̬�滮
     * */
    public static int maxSubArray2(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int sum_cur = nums[0];
        int sum_max = nums[0];
        //ѭ���ӵ�2��Ԫ�ؿ�ʼ
        for(int i=1; i<nums.length;i++) {
            //
            if(sum_cur + nums[i] > nums[i] ) {
                sum_cur += nums[i] ;
            } else {
                sum_cur = nums[i] ;
            }
            sum_max = Math.max(sum_max , sum_cur);
        }
        return sum_max;
    }
}
