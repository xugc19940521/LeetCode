package leetcode.question11;
/**
 * @CLassName Fib(509)
 * @Description 쳲���������ͨ���� F(n) ��ʾ���γɵ����г�Ϊ쳲��������С��������� 0 �� 1 ��ʼ�������ÿһ�����ֶ���ǰ���������ֵĺ͡�Ҳ���ǣ�
 *              F(0) = 0,   F(1) = 1
 *              F(N) = F(N - 1) + F(N - 2), ���� N > 1.
 *              ���� N������ F(N)��
 *              ���룺2
 *              �����1
 *              ���ͣ�F(2) = F(1) + F(0) = 1 + 0 = 1.
 * @Author xugc
 * @Date 2019/5/20
 * @Version 1.0
 */
public class Fib {

    public static int fib(int N) {
        if(N == 0) return 0;
        if(N == 1) return 1;
        return fib(N-1)+fib(N-2);
    }
}
