package leetcode.question20;

import java.util.HashSet;

/**
 * @CLassName RepeatedNTimes(961)
 * @Description 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 *              返回重复了 N 次的那个元素。
 * @Author xugc
 * @Date 2019/2/25
 * @Version 1.0
 */
public class RepeatedNTimes {

    public static int repeatedNTimes(int[] A) {
        HashSet set = new HashSet();
        for(int a : A){
            if(set.contains(a)){
                return a;
            }else{
                set.add(a);
            }
        }
        return 0;
    }
}
