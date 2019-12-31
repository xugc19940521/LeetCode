package leetcode.question2;

/**
 * @CLassName NumDecodings(91)
 * @Description 一条包含字母 A-Z 的消息通过以下方式进行了编码：
 *              'A' -> 1
 *              'B' -> 2
 *               ...
 *              'Z' -> 26
 *              给定一个只包含数字的非空字符串，请计算解码方法的总数。
 *              输入: "226" 输出: 3
 *              解释: 它可以解码为 "BZ" (2 26), "VF" (22 6), 或者 "BBF" (2 2 6) 。
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
