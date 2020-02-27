package leetcode.question20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @CLassName PowerfulIntegers(970)
 * @Description 给定两个正整数 x 和 y，如果某一整数等于 x^i + y^j，其中整数 i >= 0 且 j >= 0，那么我们认为该整数是一个强整数。
 *              返回值小于或等于 bound 的所有强整数组成的列表。
 *              你可以按任何顺序返回答案。在你的回答中，每个值最多出现一次。

 *              输入： x = 2, y = 3, bound = 10
 *              输出： [2,3,4,5,7,9,10]
 * @Version 1.0
 */
public class PowerfulIntegers {

    public static List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set s = new HashSet<>();

        int divisor = 1;
        for(int i=bound;i>=2;i--){
            while(divisor<=bound){
                int extra = bound - divisor;


                divisor = divisor*x;
            }

        }
        return new ArrayList<>(s);
    }
}
