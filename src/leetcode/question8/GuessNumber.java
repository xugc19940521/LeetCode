package leetcode.question8;


/**
 * @CLassName GuessNumber(374)
 * @Description 我们正在玩一个猜数字游戏。 游戏规则如下：
 *              我从?1?到?n?选择一个数字。 你需要猜我选择了哪个数字。
 *              每次你猜错了，我会告诉你这个数字是大了还是小了。
 *              你调用一个预先定义好的接口?guess(int num)，它会返回 3 个可能的结果（-1，1?或 0）：
 *                -1 : 我的数字比较小
 *                1 : 我的数字比较大
 *                0 : 恭喜！你猜对了！
 *               输入: n = 10, pick = 6
 *               输出: 6
 * @Version 1.0
 */
public class GuessNumber {


    public static int guessNumber(int n) {
        if(n == 1) return 1;
        int left = 0, right = n;
        while( true ){
            int mid = (right-left)/2 + left;
            int result = guess(mid);
            if(result == 0){
                return mid;
            }else if(result < 0){
                right = mid - 1;
            }else if(result > 0){
                left = mid + 1;
            }
        }
    }

    public static int guess(int s){
        if(s > 6) return -1;
        if(s == 6) return 0;
        if(s < 6) return 1;
        return 0;
    }

}
