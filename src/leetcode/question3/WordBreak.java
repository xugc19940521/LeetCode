package leetcode.question3;

import java.util.List;

/**
 * @CLassName WordBreak(139)
 * @Description 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词
 *             拆分时可以重复使用字典中的单词
 *             你可以假设字典中没有重复的单词。
 *             输入: s = "leetcode", wordDict = ["leet", "code"]
 *             输出: true
 *             解释: 返回 true 因为 "leetcode" 可以被拆分成 "leet code"。
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
