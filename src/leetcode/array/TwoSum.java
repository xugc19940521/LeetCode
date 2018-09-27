package leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @CLassName TwoSum
 * @Description 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * @Author xugc
 * @Date 2018/9/17 0:10
 * @Version 1.0
 */
public class TwoSum {

    /**
     * @method  twoSum
     * @description 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
     *              你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums,int target){
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    result[0] = nums[i];
                    result[1] = nums[j];
                    break;
                }
            }
        }
        return result;
    }


    /**
     * @method  twonums2
     * @description 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
     *              函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
     *              说明:
     *              返回的下标值（index1 和 index2）不是从零开始的。
     *              你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
     * @param nums
     * @param target
     * @return
     */
    public static int[] twonums2(int[] nums, int target){
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i+1);
        }

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                int index1 = i+1;
                int index2 = map.get(target-nums[i]);
                if(index1 == index2)continue;
                int max = index1>index2?index1:index2;
                int min = index1>index2?index2:index1;
                result[0] = min;
                result[1] = max;
            }
        }
        return result;
    }



}
