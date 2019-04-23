package leetcode.question1;

/**
 * @CLassName Reverse(7)
 * @Description  给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *               输入：123
 *               输出：321
 * @Author xugc
 * @Date 2019/4/23 21:45
 * @Version 1.0
 */
public class Reverse {

    public static int reverse(int x) {
        int rNum = x < 0 ? -x : x;
        String sb = new StringBuffer(String.valueOf(rNum)).reverse().toString();
        try{
            rNum = Integer.parseInt(sb);
            return x < 0 ? -rNum : rNum;
        }catch(Exception e){
            return 0;
        }
    }
}
