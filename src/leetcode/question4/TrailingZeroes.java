package leetcode.question4;

/**
 * @CLassName TrailingZeroes(172)
 * @Description ����һ������ n������ n! ���β�������������
 *              ���룺 5
 *              �����1
 *              ����: 5! = 120, β������ 1 ����.
 * @Version 1.0
 */
public class TrailingZeroes {

    public static int trailingZeroes(int n) {
        int result = 0;
        for(int i=1;i<=n;i++){
            int N = i;
            while(N>0){
                if(N%5 == 0){
                    result++;
                    N = N/5;
                }else{
                    break;
                }
            }
        }
        return result;
    }

    public static int trailingZeroes2(int n) {
        int result = 0;
        while(n>=5){
            result += n / 5;
            n /= 5;
        }
        return result;
    }
}
