package leetcode.question13;

import java.util.Arrays;

/**
 * @CLassName MaximumProduct(628)
 * @Description ����һ���������飬���������ҳ�����������ɵ����˻������������˻�
 *              ˵�����������������鳤�ȷ�Χ��[3,104]�����������е�Ԫ�ط�Χ��[-1000, 1000]��
 *               ����������������������ĳ˻����ᳬ��32λ�з��������ķ�Χ��
 * @Version 1.0
 */
public class MaximumProduct {
    public int maximumProduct(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        int length = nums.length;
        if(nums[length-1] == 0){
            return 0;
        }else if(nums[length-1] > 0){
            if(nums[0] * nums[1] > nums[length-2] * nums[length-3]) {
                max = nums[length-1] * nums[0] * nums[1];
            }else{
                max = nums[length-1] * nums[length-2] * nums[length-3];
            }
        }else if(nums[length-1] < 0){
             max = nums[length-1] * nums[length-2] * nums[length-3];
        }
        return max;
    }

}
