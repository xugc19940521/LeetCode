package leetcode.question1;


/**
 * @CLassName SearchRange(34)
 * @Description ����һ�������������е��������� nums����һ��Ŀ��ֵ target���ҳ�����Ŀ��ֵ�������еĿ�ʼλ�úͽ���λ�á�
 *              ����㷨ʱ�临�Ӷȱ����� O(log n) ����
 *
 *              ���룺 nums = [5,7,7,8,8,10], target = 8
 *              ����� [3,4]
 * @Version 1.0
 */
public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        int length = nums.length;
        if(nums.length==0) return result;
        //�ҿ�ʼλ��
        int left = 0, right = length-1;
        while(left<right-1){
            int mid = (right-left)/2 + left;
            if(nums[mid] >= target){
                right = mid;
            }else{
                left = mid;
            }
        }
        if(nums[left] == target){
            result[0] = left;
        }else if(nums[right] == target){
            result[0] = right;
        }

       //�ҽ���λ��
       left = 0; right = length-1;
        while(left<right-1){
            int mid = (right-left)/2 + left;
            if(nums[mid] <= target){
                left = mid;
            }else{
                right = mid;
            }
        }
        if(nums[right] == target){
            result[1] = right;
        }else if(nums[left] == target){
            result[1] = left;
        }
        return result;
    }

}
