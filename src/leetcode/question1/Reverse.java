package leetcode.question1;

/**
 * @CLassName Reverse(7)
 * @Description  ����һ�� 32 λ���з�������������Ҫ�����������ÿλ�ϵ����ֽ��з�ת��
 *               ���룺123
 *               �����321
 * @Author xugc
 * @Date 2019/4/23 21:45
 * @Version 1.0
 */
public class Reverse {

    public static int reverse(int x) {
        int rNum = x < 0 ? -x : x;
        String sb = new StringBuffer(String.valueOf(rNum)).reverse().toString();
        try{
            rNum = Integer.parseInt(sb);
            return x < 0 ? -rNum : rNum;
        }catch(Exception e){
            return 0;
        }
    }
}
