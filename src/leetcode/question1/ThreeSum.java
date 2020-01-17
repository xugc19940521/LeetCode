package leetcode.question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @CLassName ThreeSum(15)
 * @Description 给定一个包含 n 个整数的数组?nums，判断?nums?中是否存在三个元素 a，b，c ，
 *              使得?a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 *              输入： [-1, 0, 1, 2, -1, -4]
 *              输出：[
 *                      [-1, 0, 1],
 *                      [-1, -1, 2]
 *                   ]
 * @Author xugc
 * @Date 2020/01/03
 * @Version 1.0
 */
public class ThreeSum {
    // -4, -1, -1, 0, 1, 2
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for(int i=0; i<len-2; i++){
            if(nums[i]>0)break;
            if(i<=len-3 && nums[i]==0 && nums[i+1]==0 && nums[i+2] ==0){
                ArrayList a = new ArrayList();
                a.add(0);a.add(0);a.add(0);
                result.add(a);
                break;
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1, right = len-1;
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum > 0){
                    right -= 1;
                }else if(sum==0){
                    if(right<len-1 && nums[right] == nums[right+1]){
                        right -= 1;
                        continue;
                    }
                    ArrayList a = new ArrayList();
                    a.add(nums[i]);a.add(nums[left]);a.add(nums[right]);
                    result.add(a);
                    right -= 1;
                }else if(sum < 0){
                    left += 1;
                }
            }
        }

        return result;
    }
}
