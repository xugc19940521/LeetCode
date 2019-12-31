package leetcode.question5;

import java.util.HashSet;
import java.util.Set;

/**
 * @CLassName IsHappy(202)
 * @Description 编写一个算法来判断一个数是不是“快乐数”。，
 *              一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 *
 *               输入: 19
 *               输出: true
 * @Version 1.0
 */
public class IsHappy {

    public static boolean isHappy(int n) {
        Set numbers = new HashSet();
        while(n!=1){
            int tmp = 0;
            while(n>=10){
                int x = n%10;
                tmp += x*x;
                n = n/10;
            }
            tmp += n*n;
            if(numbers.contains(tmp)){
                return false;
            }else{
                numbers.add(tmp);
            }
            n = tmp;
        }
        return true;
    }
}
