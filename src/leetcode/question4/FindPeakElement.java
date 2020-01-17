package leetcode.question4;

/**
 * @CLassName FindPeakElement(162)
 * @Description ��ֵԪ����ָ��ֵ������������ֵ��Ԫ��
 *              ����һ���������� nums������ nums[i] �� nums[i+1]���ҵ���ֵԪ�ز�������������
 *              ������ܰ��������ֵ������������£������κ�һ����ֵ����λ�ü��ɡ�
 *              ����Լ��� nums[-1] = nums[n] = -�ޡ�
 *              ���룺 nums = [1,2,3,1]
 *              ����� 2
 * @Version 1.0
 */
public class FindPeakElement {

    public static int findPeakElement(int[] nums) {
        int len = nums.length;
        if(len == 2)return nums[0]>nums[1]?0:1;
        int left = 0, right = len-1;
        while(left<right-1){
            int mid = (right-left)/2+left;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[mid]<nums[mid-1]){
                right = mid;
            }else if(nums[mid]<nums[mid+1]){
                left = mid;
            }
        }
        return nums[left]>nums[right]?left:right;
    }
}
