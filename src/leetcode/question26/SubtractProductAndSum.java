package leetcode.question26;

/**
 * @CLassName SubtractProductAndSum(1281)
 * @Description ����һ������ n�������æ���㲢���ظ���������λ����֮�����롸��λ����֮�͡��Ĳ
 *              ���룺n = 234
 *              �����15
 * @Version 1.0
 */
public class SubtractProductAndSum {
    public static int subtractProductAndSum(int n) {
        int sum = 0 , product = 1;
        while(n>=10){
            int remainder = n%10;
            sum += remainder;
            product *= remainder;
            n = n/10;
        }
        sum += n;
        product *= n;
        return product-sum;
    }
}
