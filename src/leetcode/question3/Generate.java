package leetcode.question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @CLassName Generate(118)
 * @Description 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行
 *
 *               输入：5
 *               输出：[
 *                      [1],
 *                      [1,1],
 *                      [1,2,1],
 *                      [1,3,3,1],
 *                      [1,4,6,4,1]
 *                    ]
 * @Author xugc
 * @Date 2019/11/16
 * @Version 1.0
 */
public class Generate {

    public static List<List<Integer>> generate(int numRows) {

        int[][] resultArr = new int[numRows][];
        for(int i=0; i<numRows; i++){
            resultArr[i] = new int[i+1];
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    resultArr[i][j] = 1;
                }else{
                    resultArr[i][j] =  resultArr[i-1][j-1] + resultArr[i-1][j];
                }
            }
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < resultArr.length; i++) {
            List<Integer> columnList = new ArrayList<Integer>();
            for (int j = 0; j < resultArr[i].length; j++) {
                columnList.add(j, resultArr[i][j]);
            }
            result.add(i, columnList);
        }
        return result;
    }
}
