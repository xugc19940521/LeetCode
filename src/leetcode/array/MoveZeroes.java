package leetcode.array;

/**
 * <p>����: MoveZeroes</p>
 * <p/>
 * <p>����: ${DESCRIPTION}</p>
 * <p/>
 * ${DETAIL}
 * <p/>
 * <p>��Ȩ: ˰��������Źɷ����޹�˾</p>
 * <p/>
 * <p>����ʱ��: 2018-09-17</p>
 * <p/>
 * <p>���ߣ�xugc</p>
 */

public class MoveZeroes {

    public static void moveZeroes(int[] nums){
        if(nums.length<2)return;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]==0){
                for(int j=i+1;j<nums.length;j++){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j] ;
                    nums[j] = temp;
                }
            }
        }
    }
}
