package leetcode.question3;

import java.util.List;
/**
 * @CLassName MinimumTotal(120)
 * @Description ����һ�������Σ��ҳ��Զ����µ���С·���͡�ÿһ��ֻ���ƶ�����һ�������ڵĽ���ϡ�
 *              ���磬���������Σ�
 *              [
 *                  [2],
 *                  [3,4],
 *                  [6,5,7],
 *                  [4,1,8,3]
 *              ]
 *              �Զ����µ���С·����Ϊ 11������2 + 3 + 5 + 1 = 11����
 * @Author xugc
 * @Date 2019/12/26
 * @Version 1.0
 */
public class MinimumTotal {

    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        Integer[] dp = triangle.get(n-1).toArray(new Integer[0]);

        for(int i=n-2;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                dp[j] = Math.min(dp[j]+triangle.get(i).get(j), dp[j+1]+triangle.get(i).get(j));
            }
        }

        return dp[0];
    }
}
