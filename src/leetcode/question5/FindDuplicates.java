package leetcode.question5;

import java.util.ArrayList;
import java.util.List;

/**
 * @CLassName FindDuplicates(442)
 * @Description  给定一个整数数组 a，其中1 ≤ a[i] ≤ n （n为数组长度）, 其中有些元素出现两次而其他元素出现一次。
 *               找到所有出现两次的元素。
 *               你可以不用到任何额外空间并在O(n)时间复杂度内解决这个问题吗？
 *                  输入： [4,3,2,7,8,2,3,1]
 *                  输出： [2,3 ]
 * @Author xugc
 * @Date 2020/2/10
 * @Version 1.0
 */
public class FindDuplicates {

    public static List<Integer> FindDuplicates(int[] nums) {
        List<Integer> res = new ArrayList();
        int n = nums.length+1;
        int []temp = new int[n];
        for(int i = 0;i < temp.length;i++){
            temp[i] = 0;
        }
        for(int i = 0;i < n-1;i++){
            int number = nums[i];
            temp[number] += 1;
        }
        for(int i = 1;i < temp.length;i++){
            if(temp[i] == 2){
                res.add(i);
            }
        }
        return res;
    }
}
