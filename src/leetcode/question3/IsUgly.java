package leetcode.question3;

/**
 * @CLassName IsUgly(263)
 * @Description 编写一个程序判断给定的数是否为丑数。
 *              丑数就是只包含质因数 2, 3, 5 的正整数。
 *               输入: 6
 *               输出: true
 * @Version 1.0
 */
public class IsUgly {
    public static boolean isUgly(int num) {
        if(num ==0) return false;
        s: while(num!=1){
            if(num%2==0){
                num = num/2;
                continue s;
            }
            if(num%3==0){
                num = num/3;
                continue s;
            }
            if(num%5==0){
                num = num/5;
                continue s;
            }
            return false;
        }
        return true;
    }
}
