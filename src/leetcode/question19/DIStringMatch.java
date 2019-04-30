package leetcode.question19;

/**
 * @CLassName DIStringMatch
 * @Description  ����ֻ�� "I"�����󣩻� "D"����С�����ַ��� S ���� N = S.length��
 *               ���� [0, 1, ..., N] ���������� A ʹ�ö������� i = 0, ..., N-1�����У�
 *                  ��� S[i] == "I"����ô A[i] < A[i+1]
 *                  ��� S[i] == "D"����ô A[i] > A[i+1]
 *                  ���� : "IDID"
 *                  ��� : [0,4,1,3,2]
 *                  ���� : "DDI"
 *                  ��� : [3,2,0,1]
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
