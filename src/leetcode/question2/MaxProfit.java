package leetcode.question2;

/**
 * @CLassName MaxProfit(121)
 * @Description ����һ�����飬���ĵ�?i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�
 *              ��������ֻ�������һ�ʽ��ף������������һ֧��Ʊ�������һ���㷨�����������ܻ�ȡ���������
 *              ע���㲻���������Ʊǰ������Ʊ
 *
 *               ���룺[7,1,5,3,6,4]
 *               �����5
 * @Author xugc
 * @Date 2019/11/16
 * @Version 1.0
 */
public class MaxProfit {

    public static int maxProfit(int[] prices){
        if(prices.length<=1)return 0;
        int sum = 0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int temp = prices[j]-prices[i];
                sum = sum>temp?sum:temp;
            }
        }
        return sum;
    }
}
