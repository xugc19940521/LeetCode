package leetcode.array;

/**
 * @CLassName Rotate
 * @Description ����һ�����飬�������е�Ԫ�������ƶ� k ��λ�ã����� k �ǷǸ�����
 *              �������������Ľ�����������������ֲ�ͬ�ķ������Խ��������⡣
 *              Ҫ��ʹ�ÿռ临�Ӷ�Ϊ O(1) ��ԭ���㷨��
 *              ����: [1,2,3,4,5,6,7] �� k = 3
 *              ���: [5,6,7,1,2,3,4]
 * @Author xugc
 * @Date 2018/9/17 22:01
 * @Version 1.0
 */
public class Rotate {

    public static void rotate(int[] nums, int k) {

        // [1,2,3,4,5,6,7]  ----> [1,2,3,1,5,6,7]   4
        int temp = nums[0];

        //0/3/6/2/5/1/4/0

        //6/2
        for(int i=nums.length-1;i==0;i=(i+3)%nums.length){
            nums[i+k] = temp;
            temp = nums[i+k];
        }
    }
}
