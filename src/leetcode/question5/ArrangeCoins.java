package leetcode.question5;


/**
 * @CLassName ArrangeCoins(441)
 * @Description ���ܹ��� n öӲ�ң�����Ҫ�����ǰڳ�һ��������״���� k �оͱ��������� k öӲ�ҡ�
 *              ����һ������ n���ҳ����γ����������е���������
 *              n ��һ���Ǹ�������������32λ�з������͵ķ�Χ�ڡ�
 *              ���룺5
 *              �����2
 * @Author xugc
 * @Date 2019/4/30 13:25
 * @Version 1.0
 */
public class ArrangeCoins {

    public static int arrangeCoins(int n){

        int i = 0;
        while(n>=i){
            n -= i;
            i++;
        }
        return i-1;
    }
}
