package leetcode.question4;

/**
 * @CLassName IsSubsequence(392)
 * @Description  �����ַ��� s �� t ���ж� s �Ƿ�Ϊ t �������С�
 *               ע�⣺
 *                  �������Ϊ s �� t �н�����Ӣ��Сд��ĸ���ַ��� t ���ܻ�ܳ������� ~= 500,000������ s �Ǹ����ַ��������� <=100����
 *                  �ַ�����һ����������ԭʼ�ַ���ɾ��һЩ��Ҳ���Բ�ɾ�����ַ������ı�ʣ���ַ����λ���γɵ����ַ����������磬"ace"��"abcde"��һ�������У���"aec"���ǣ���
 *               ���룺 s = "abc", t = "ahbgdc"
 *               ����� true
 * @Author xugc
 * @Date 2019/12/25
 * @Version 1.0
 */
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if(sLen > tLen) return false;
        if(sLen == 0) return true;
        boolean[][] d = new boolean[sLen+1][tLen+1];
        for(int i=0;i<=tLen;i++){
            d[0][i] = true;
        }
        for(int i=1;i<=sLen;i++){
            for(int j=1;j<=tLen; j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    d[i][j] = d[i-1][j-1];
                }else{
                    d[i][j] = d[i][j-1];
                }
            }
        }
        return d[sLen][tLen];
    }


}
