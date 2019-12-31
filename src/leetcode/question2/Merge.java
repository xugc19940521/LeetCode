package leetcode.question2;

import java.util.Arrays;

/**
 * @CLassName Merge(88)
 * @Description 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 *              初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 *              你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 *
 *               输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6],       n = 3
 *               输出：[1,2,2,3,5,6]
 * @Author xugc
 * @Date 2019/12/31
 * @Version 1.0
 */
public class Merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m,j=0;i<=m+n-1;i++,j++){
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }

}
