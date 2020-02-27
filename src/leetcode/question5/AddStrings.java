package leetcode.question5;

/**
 * @CLassName AddStrings(415)
 * @Description  ���������ַ�����ʽ�ķǸ����� num1 ��num2 ���������ǵĺ�
 *               ע�⣺
 *                  num1 ��num2 �ĳ��ȶ�С�� 5100.
 *                  num1 ��num2 ��ֻ�������� 0-9.
 *                  num1 ��num2 ���������κ�ǰ���㡣
 *                  �㲻��ʹ���κ΃Ƚ� BigInteger �⣬ Ҳ����ֱ�ӽ�������ַ���ת��Ϊ������ʽ��
 * @Author xugc
 * @Date 2019/4/30 13:25
 * @Version 1.0
 */
public class AddStrings {
    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0, i = num1.length()-1, j = num2.length()-1;
        while(i >= 0 || j >= 0 || carry != 0){
            if(i>=0) carry += num1.charAt(i--)-'0';
            if(j>=0) carry += num2.charAt(j--)-'0';
            sb.append(carry%10);
            carry /= 10;
        }
        return sb.reverse().toString();
    }
}
