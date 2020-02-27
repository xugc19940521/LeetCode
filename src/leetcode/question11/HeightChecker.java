package leetcode.question11;

import java.util.Arrays;

/**
 * @CLassName HeightChecker(1051)
 * @Description ѧУ������ȼ�����ʱ��һ��Ҫ��ѧ������ �ǵݼ� �ĸ߶�˳�����С�
 *              ���㷵�������ж��ٸ�ѧ��û��վ����ȷλ��������
 *              ������ָ���ǣ���������ѧ���� �ǵݼ� �߶����еı�Ҫ�ƶ�������
 * @Author xugc
 * @Date 2019/5/31
 * @Version 1.0
 */
public class HeightChecker {

    public static int heightChecker(int[] heights) {

        int diff = 0;
        int[] copy = Arrays.copyOf(heights,heights.length);
        Arrays.sort(copy);
        for(int i=0;i<copy.length;i++){
            if(heights[i] != copy[i]){
                diff++;
            }
        }
        return diff;
    }
}
