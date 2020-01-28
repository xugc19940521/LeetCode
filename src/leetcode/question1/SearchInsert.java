package leetcode.question1;

public class SearchInsert {

    /**
     * ��ʵ��
     * */
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }

    /**
     *���ַ�
     * */
    public int searchInsert2(int[] nums, int target) {
        int left = 0, right = nums.length;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return right;
    }

}
