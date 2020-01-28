package leetcode.question21;

/**
 * @CLassName DivisorGame(1025)
 * @Description ����˿�ͱ���һ������Ϸ�����������ж�������˿���ֿ��֡�
 *              ������ڰ�����һ������ N ����ÿ����ҵĻغϣ������Ҫִ�����²�����
 *              ѡ����һ x������ 0 < x < N �� N % x == 0 ��
 *              �� N - x �滻�ڰ��ϵ����� N ��
 *              �������޷�ִ����Щ�������ͻ������Ϸ��
 *              ֻ���ڰ���˿����Ϸ��ȡ��ʤ��ʱ�ŷ��� True�����򷵻� false������������Ҷ������״̬������Ϸ��
 *              ���룺2  �����true
 *              ���ͣ�����˿ѡ�� 1�������޷����в�����
 * @Author xugc
 * @Date 2019/10/26
 * @Version 1.0
 */
public class DivisorGame {

    public static boolean divisorGame(int N) {

        boolean[] f = new boolean[N+1];
        f[0] = false;
        f[1] = false;
        s: for(int i=2;i<N+1;i++){
            for(int j=1; j<=i/2; j++){
                if(i%j==0){
                    if(f[i-j]==false){
                       f[i] = true;
                       continue s;
                    }
                }
            }
        }
        return f[N];
    }
}
