package leetcode.question26;

/**
 * @CLassName FindNumbers(1295)
 * @Description ����һ���������� nums�����㷵������λ��Ϊ ż�� �����ֵĸ�����
 *              ���룺nums = [12,345,2,6,7896]
 *              �����2
 * @Version 1.0
 */
public class FindNumbers {

    public static int findNumbers(int[] nums) {
        int result = 0;
        for(int i=0;i<nums.length;i++){
            String s = nums[i] + "";
            if(s.length()%2 == 0){
                result ++;
            }
        }
        return result;
    }
}
