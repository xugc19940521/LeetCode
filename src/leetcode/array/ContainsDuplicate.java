package leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @CLassName ContainsDuplicate
 * @Description 给定一个整数数组，判断是否存在重复元素。
 *              如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * @Author xugc
 * @Date 2018/9/12 23:14
 * @Version 1.0
 */
public class ContainsDuplicate {
    public  static boolean containsDuplicate(int[] nums) {
        if(nums.length<=1){
            return false;
        }
        Map map = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i],"1");
            }
        }
        return false;
    }
}
