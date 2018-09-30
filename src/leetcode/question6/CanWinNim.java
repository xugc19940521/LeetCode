package leetcode.question6;
/**
 * @CLassName CanWinNim(292)
 * @Description     你和你的朋友，两个人一起玩 Nim游戏：桌子上有一堆石头，每次你们轮流拿掉 1 - 3 块石头。
 *                  拿掉最后一块石头的人就是获胜者。你作为先手。
 *                  你们是聪明人，每一步都是最优解。 编写一个函数，来判断你是否可以在给定石头数量的情况下赢得游戏。
 *                  输入：4
 *                  输出：false
 * @Author xugc
 * @Date 2018/9/30
 * @Version 1.0
 */
public class CanWinNim {

    //假设f[t]=1表示t个石头的时候先手会赢，f[t]=0表示t个石头的时候会输
    public static boolean canWinNim(int n){

        int stones = n;
        int[] f = new int[stones+1] ;
        int[] k = {1,2,3};

        f[1] = 1;//1个石头的时候先手会赢
        for(int i=2;i<=stones;i++){
            f[i] = 0;
            for(int j=0;j<k.length;j++){
                //当拿掉k[j]个石头时，剩余i-k[j]个石头，如果此时 f[i-k[j]]先手会输的话，f[i]必赢
                if(f[i-k[j]]==0){
                    f[i] = 1;
                    break;
                }
            }
        }
        return f[stones]==1;
    }

    //只要是4的倍数就一定输，反正一定赢
    public static boolean canWinNim2(int n){
        return n%4!=0;
    }
}
