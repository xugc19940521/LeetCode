package leetcode.array;

/**
 * @CLassName RemoveElement
 * @Description ����һ������ nums ��һ��ֵ val������Ҫԭ���Ƴ�������ֵ���� val ��Ԫ�أ������Ƴ���������³��ȡ�
 *              ��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
 *              Ԫ�ص�˳����Ըı䡣�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
 *              ���룺nums = [3,2,2,3], val = 3
 *              �����2
 * @Author xugc
 * @Date 2018/9/18
 * @Version 1.0
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int len = nums.length, i=-1;
        for(int j=0;j<len;j++){
            if(nums[j] != val){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
