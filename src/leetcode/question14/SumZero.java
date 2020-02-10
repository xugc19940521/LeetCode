package leetcode.question14;

/**
 * @CLassName SumZero(1304)
 * @Description ����һ������ n�����㷵�� ���� һ���� n �� ������ͬ ��������ɵ����飬������ n ������Ӻ�Ϊ 0 ��
 *              ���룺n = 5
 *              �����[-7,-1,1,3,4]
 * @Author xugc
 * @Date 2020/2/9
 * @Version 1.0
 */
public class SumZero {

    public static int[] sumZero(int n) {
        int[] r = new int[n];
        if(n==1) {
            r =  new int[]{0};
        }
        for (int i = 0; i < n - 1; i++) {
            r[i] = i+1;
        }
        if (n-1>0){
            r[n - 1] = -n * (n - 1) / 2;
        }
        return r;
    }
}
