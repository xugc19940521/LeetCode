package leetcode.question14;

/**
 * @CLassName DecompressRLElist(1323)
 * @Description ����һ���������� 6 �� 9 ��ɵ������� num��
 *              �����ֻ�ܷ�תһλ���֣��� 6 ��� 9�����߰� 9 ��� 6 ��
 *              �뷵������Եõ���������֡�
 *              ���룺num = 9669
 *              �����9969
 * @Author xugc
 * @Date 2020/2/9
 * @Version 1.0
 */
public class Maximum69Number {

    public static int maximum69Number (int num) {
        String str = String.valueOf(num);
        char[] c = str.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='6'){
                c[i] = '9';
                break;
            }
        }
        return Integer.parseInt(String.valueOf(c));
    }
}
