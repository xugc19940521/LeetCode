package leetcode.question2;

/**
 *@CLassName ClimbStairs(70)
 * ������������¥�ݡ���Ҫ n ������ܵ���¥����
 *
 * ÿ��������� 1 �� 2 ��̨�ס����ж����ֲ�ͬ�ķ�����������¥���أ�
 *
 * ע�⣺���� n ��һ����������
 * */

public class ClimbStairs {

    /**
     * ��Ϊÿ�������� 1 �� 2 ��̨�ף����Ƿ�����˼��
     * ̨��n ������1̨�ף� ̨��n-1�� ��2̨�ף�̨��n-2
     * ����̨��n = ̨��n-1 + ̨��n-2
     * */
    public static int climbStairs(int n){
        int[] a =  new int[n+1];
        a[0] = 1;
        a[1] = 1;
        for(int i=2;i<=n;i++){
           a[i] = a[i-1] + a[i-2];
        }
        return a[n];
    }
}
