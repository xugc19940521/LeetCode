package leetcode.question1;

/**
 * @CLassName MaxArea(11)
 * @Description 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点?(i,?ai) 。
 *              在坐标内画 n 条垂直线，垂直线 i?的两个端点分别为?(i,?ai) 和 (i, 0)。
 *              找出其中的两条线，使得它们与?x?轴共同构成的容器可以容纳最多的水。
 *              输入： [1,8,6,2,5,4,8,3,7]  输出：49
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
