package leetcode.question1;

/**
 * @CLassName MaxArea(11)
 * @Description ���� n ���Ǹ����� a1��a2��...��an��ÿ�������������е�һ����?(i,?ai) ��
 *              �������ڻ� n ����ֱ�ߣ���ֱ�� i?�������˵�ֱ�Ϊ?(i,?ai) �� (i, 0)��
 *              �ҳ����е������ߣ�ʹ��������?x?�Ṳͬ���ɵ�����������������ˮ��
 *              ���룺 [1,8,6,2,5,4,8,3,7]  �����49
 * @Author xugc
 * @Date 2020/01/03
 * @Version 1.0
 */
public class MaxArea {

    public static int maxArea(int[] height) {
        int result = 0;
        int length = height.length;
        for(int i=0;i<length;i++){
            for(int j=i+1; j<length;j++){
                int temp = (j-i)*Math.min(height[i], height[j]);
                result = Math.max(temp, result);
            }
        }
        return result;
    }
}
