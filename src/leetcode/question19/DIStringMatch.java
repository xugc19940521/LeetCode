package leetcode.question19;

/**
 * @CLassName DIStringMatch
 * @Description  给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。
 *               返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：
 *                  如果 S[i] == "I"，那么 A[i] < A[i+1]
 *                  如果 S[i] == "D"，那么 A[i] > A[i+1]
 *                  输入 : "IDID"
 *                  输出 : [0,4,1,3,2]
 *                  输入 : "DDI"
 *                  输出 : [3,2,0,1]
 * @Author xugc
 * @Date 2019/2/25
 * @Version 1.0
 */
public class DIStringMatch {

    public static int[]  diStringMatch(String S){

        char[] s = S.toCharArray();
        int max = s.length;
        int[] R = new int[max+1];
        int indexOfD = 0, indexOfI = 0;
        for(int i=0,len=s.length;i<len;i++){
            if(s[i] == 'D'){
                R[i] = max - indexOfD;
                indexOfD++;
            }
        }
        for(int i=0,len=R.length;i<len;i++){
            if(R[i] == 0){
                R[i] = 0 + indexOfI;
                indexOfI++;
            }
        }
        return R;
    }
}
