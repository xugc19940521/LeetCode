package leetcode.question2;

/**
 * @CLassName UniquePathsWithObstacles(63)
 * @Description һ��������λ��һ�� m x n ��������Ͻ� ����ʼ������ͼ�б��Ϊ��Start�� ����
 *              ������ÿ��ֻ�����»��������ƶ�һ������������ͼ�ﵽ��������½ǣ�����ͼ�б��Ϊ��Finish������
 *              ���ܹ��ж�������ͬ��·����
 * @Author xugc
 * @Date 2019/12/26
 * @Version 1.0
 */
public class UniquePathsWithObstacles {

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            if(obstacleGrid[i][0] == 1){
                dp[i][0] = 0;
            }else{
                if(i>0 && dp[i-1][0] == 0) {
                    dp[i][0] = 0;
                }else{
                    dp[i][0] = 1;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(obstacleGrid[0][i] == 1){
                dp[0][i] = 0;
            }else{
                if(i>0 && dp[0][i-1] == 0) {
                    dp[0][i] = 0;
                }else{
                    dp[0][i] = 1;
                }
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                }else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
