package leetcode.question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @CLassName GetRow(119)
 * @Description 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 *
 *               输入：3
 *               输出： [1,3,3,1]
 * @Author xugc
 * @Date 2019/12/31
 * @Version 1.0
 */
public class GetRow {
    public static List<Integer> getRow(int rowIndex) {
        Integer[][] resultArr = new Integer[rowIndex+1][];
        for(int i=0; i<rowIndex+1; i++){
            resultArr[i] = new Integer[i+1];
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    resultArr[i][j] = 1;
                }else{
                    resultArr[i][j] =  resultArr[i-1][j-1] + resultArr[i-1][j];
                }
            }
        }
        List<Integer> result = Arrays.asList(resultArr[rowIndex]);
        return result;
    }
}
