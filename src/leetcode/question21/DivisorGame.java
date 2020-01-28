package leetcode.question21;

/**
 * @CLassName DivisorGame(1025)
 * @Description 爱丽丝和鲍勃一起玩游戏，他们轮流行动。爱丽丝先手开局。
 *              最初，黑板上有一个数字 N 。在每个玩家的回合，玩家需要执行以下操作：
 *              选出任一 x，满足 0 < x < N 且 N % x == 0 。
 *              用 N - x 替换黑板上的数字 N 。
 *              如果玩家无法执行这些操作，就会输掉游戏。
 *              只有在爱丽丝在游戏中取得胜利时才返回 True，否则返回 false。假设两个玩家都以最佳状态参与游戏。
 *              输入：2  输出：true
 *              解释：爱丽丝选择 1，鲍勃无法进行操作。
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
