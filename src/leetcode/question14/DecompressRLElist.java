package leetcode.question14;

import java.util.ArrayList;

/**
 * @CLassName DecompressRLElist(1313)
 * @Description 给你一个以行程长度编码压缩的整数列表?nums?。
 *              考虑每对相邻的两个元素 [a, b] = [nums[2*i], nums[2*i+1]]?（其中?i >= 0?），每一对都表示解压后有 a?个值为?b?的元素。
 *              请你返回解压后的列表。
 *              输入：nums = [1,2,3,4]
 *              输出：[2,4,4,4]
 * @Author xugc
 * @Date 2020/2/9
 * @Version 1.0
 */
public class DecompressRLElist {

    public static int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++){
                a.add(nums[i+1]);
            }
        }
        int[] result = new int[a.size()];
        for(int i=0;i<a.size();i++){
            result[i] = a.get(i);
        }
        return result;
    }
}
