package leetcode.question5;

import java.util.ArrayList;
import java.util.List;

/**
 * @CLassName FindDisappearedNumbers(448)
 * @Description  给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 *               找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 *                  您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 *                  输入： [4,3,2,7,8,2,3,1]
 *                  输出： [5,6]
 * @Author xugc
 * @Date 2020/2/10
 * @Version 1.0
 */
public class FindDisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList();
        int n = nums.length+1;
        int []temp = new int[n];
        for(int i = 0;i < temp.length;i++){
            temp[i] = 0;
        }
        for(int i = 0;i < n-1;i++){
            int number = nums[i];
            temp[number] = 1;
        }
        for(int i = 1;i < temp.length;i++){
            if(temp[i] == 0){
                res.add(i);
            }
        }
        return res;
    }
}
