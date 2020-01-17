package leetcode.question26;

/**
 * @CLassName MinTimeToVisitAllPoints(1266)
 * @Description 平面上有 n 个点，点的位置用整数坐标表示 points[i] = [xi, yi]。请你计算访问所有这些点需要的最小时间（以秒为单位）。
 *              每一秒沿水平或者竖直方向移动一个单位长度，或者跨过对角线（可以看作在一秒内向水平和竖直方向各移动一个单位长度）。
 *              必须按照数组中出现的顺序来访问这些点。
 *              输入：points = [[1,1],[3,4],[-1,0]]
 *              输出：7
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
