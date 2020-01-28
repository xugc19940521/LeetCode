package leetcode.question2;

/**
 * @CLassName NumDecodings(91)
 * @Description һ��������ĸ A-Z ����Ϣͨ�����·�ʽ�����˱��룺
 *              'A' -> 1
 *              'B' -> 2
 *               ...
 *              'Z' -> 26
 *              ����һ��ֻ�������ֵķǿ��ַ������������뷽����������
 *              ����: "226" ���: 3
 *              ����: �����Խ���Ϊ "BZ" (2 26), "VF" (22 6), ���� "BBF" (2 2 6) ��
 * @Author xugc
 * @Date 2019/12/26
 * @Version 1.0
 */
public class NumDecodings {
    public static int numDecodings(String s) {
        if(s.charAt(0)=='0')return 0;
        int len = s.length();
        if(len == 1) return 1;
        int[] dp = new int[len+1];

        dp[0] = 1; dp[1] = 1;
        for(int i=2;i<len+1; i++){
            int c = Integer.parseInt(s.charAt(i-1)+"");
            int f = Integer.parseInt(s.charAt(i-2)+"");
            if(c==0){
                if(f==0 || f>2){
                    return 0;
                }else{
                    dp[i] = dp[i-2] ;
                }
            }else{
                if(f==0 || f*10+c>26){
                    dp[i] = dp[i-1] ;
                }else{
                    dp[i] = dp[i-1] + dp[i-2];
                }
            }
        }
        return dp[len];
    }
}
