package leetcode.question1;

/**
 * @CLassName UniquePaths(62)
 * @Description һ��������λ��һ�� m x n ��������Ͻ� ����ʼ������ͼ�б��Ϊ��Start�� ����
 *              ������ÿ��ֻ�����»��������ƶ�һ������������ͼ�ﵽ��������½ǣ�����ͼ�б��Ϊ��Finish������
 *              ���ܹ��ж�������ͬ��·����
 * @Author xugc
 * @Date 2019/12/26
 * @Version 1.0
 */


public class UniquePaths {
    public static int uniquePaths(int m, int n) {
        if(m==1 || n==1) return 1;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            dp[i][0] = 1;
        }
        for(int i=0;i<n;i++){
            dp[0][i] = 1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
