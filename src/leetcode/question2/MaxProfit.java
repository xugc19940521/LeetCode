package leetcode.question2;

/**
 * @CLassName MaxProfit(121)
 * @Description 给定一个数组，它的第?i 个元素是一支给定股票第 i 天的价格。
 *              如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 *              注意你不能在买入股票前卖出股票
 *
 *               输入：[7,1,5,3,6,4]
 *               输出：5
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
