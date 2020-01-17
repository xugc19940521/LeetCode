package leetcode.question11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @CLassName CheckPerfectNumber(507)
 * @Description 对于一个 正整数，如果它和除了它自身以外的所有正因子之和相等，我们称它为“完美数”。
 *              给定一个 整数 n， 如果他是完美数，返回 True，否则返回 False
 * @Version 1.0
 */
public class CheckPerfectNumber {

    public static boolean checkPerfectNumber(int num) {
        if(num == 0) return false;
        Set<Integer> a = new HashSet();
        for(int i=num/2;i>0;i--){
            if(num%i == 0){
                a.add(i);
            }
        }
        Iterator itr = a.iterator();
        while(itr.hasNext()){
            num = num - (Integer)itr.next();
        }

        return num == 0;
    }
}
