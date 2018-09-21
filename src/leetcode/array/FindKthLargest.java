package leetcode.array;

/**
 * @CLassName FindKthLargest
 * @Description ��δ������������ҵ��� k ������Ԫ�ء���ע�⣬����Ҫ�ҵ������������ĵ� k ������Ԫ�أ������ǵ� k ����ͬ��Ԫ�ء�
 *              ���룺[3,2,1,5,6,4] �� k = 2
 *              �����5
 *              ����Լ��� k ������Ч�ģ��� 1 �� k �� ����ĳ��ȡ�
 * @Author xugc
 * @Date 2018/9/21
 * @Version 1.0
 */
public class FindKthLargest {

    public static int findKthLargest(int[] nums, int k){
        if(nums.length==0)return 0;
        for (int i=nums.length-1; i>0; i--){
            for(int j=0;j<i; j++){
                if(nums[i]<nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            if(i == nums.length-k)break;
        }
        return nums[nums.length-k];
    }
}
