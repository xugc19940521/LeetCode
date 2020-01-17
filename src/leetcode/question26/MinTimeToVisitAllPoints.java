package leetcode.question26;

/**
 * @CLassName MinTimeToVisitAllPoints(1266)
 * @Description ƽ������ n ���㣬���λ�������������ʾ points[i] = [xi, yi]������������������Щ����Ҫ����Сʱ�䣨����Ϊ��λ����
 *              ÿһ����ˮƽ������ֱ�����ƶ�һ����λ���ȣ����߿���Խ��ߣ����Կ�����һ������ˮƽ����ֱ������ƶ�һ����λ���ȣ���
 *              ���밴�������г��ֵ�˳����������Щ�㡣
 *              ���룺points = [[1,1],[3,4],[-1,0]]
 *              �����7
 * @Version 1.0
 */
public class MinTimeToVisitAllPoints {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        for(int i=0;i<points.length-1;i++){
            int max = Math.max(Math.abs(points[i+1][0]-points[i][0]),Math.abs(points[i+1][1]-points[i][1]));
            result += max;
        }
        return result;
    }

}
