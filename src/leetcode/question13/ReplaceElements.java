package leetcode.question13;

/**
 * @CLassName ReplaceElements(1299)
 * @Description 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 *              完成所有替换操作后，请你返回这个数组。
 *              输入：arr = [17,18,5,4,6,1]
 *              输出：[18,6,6,6,1,-1]
 * @Author xugc
 * @Date 2020/2/9
 * @Version 1.0
 */
public class ReplaceElements {
    public static int[] replaceElements(int[] arr) {
        int[] r = new int[arr.length];
        int max = -1;
        for(int i=arr.length-1;i>=0;i--){
            r[i] = max;
            max = Math.max(max, arr[i]);
        }
        return r;
    }
}
