package leetcode.question3;

import java.util.List;

/**
 * @CLassName WordBreak(139)
 * @Description ����һ���ǿ��ַ��� s ��һ�������ǿյ����б���ֵ� wordDict���ж� s �Ƿ���Ա��ո���Ϊһ���������ֵ��г��ֵĵ���
 *             ���ʱ�����ظ�ʹ���ֵ��еĵ���
 *             ����Լ����ֵ���û���ظ��ĵ��ʡ�
 *             ����: s = "leetcode", wordDict = ["leet", "code"]
 *             ���: true
 *             ����: ���� true ��Ϊ "leetcode" ���Ա���ֳ� "leet code"��
 * @Author xugc
 * @Date 2019/12/26
 * @Version 1.0
 */
public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for(int i=1;i<=n;i++){
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
