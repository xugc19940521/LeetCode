package leetcode.question11;

import java.util.Arrays;

/**
 * @CLassName HeightChecker(1051)
 * @Description 学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。
 *              请你返回至少有多少个学生没有站在正确位置数量。
 *              该人数指的是：能让所有学生以 非递减 高度排列的必要移动人数。
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
