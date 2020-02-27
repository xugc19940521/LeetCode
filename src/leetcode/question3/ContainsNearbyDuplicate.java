package leetcode.question3;

/**
 * @CLassName ContainsNearbyDuplicate(219)
 * @Description ����һ�����������һ������?k���ж��������Ƿ����������ͬ������?i?��?j��
 *              ʹ��?nums [i] = nums [j]������ i �� j?�Ĳ�ľ���ֵ���Ϊ k��
 *
 *               ����: nums = [1,2,3,1], k = 3
 *               ���: true
 * @Version 1.0
 */
public class ContainsNearbyDuplicate {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int j=k;j>0;j--){
            for(int i=0;i<nums.length-j;i++){
                if(nums[i] == nums[i+j]){
                    return true;
                }
            }
        }
        return false;
    }
}
