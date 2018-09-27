package leetcode.question19;

/**
 * @CLassName SortArrayByParity(905)
 * @Description 给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。
 *              你可以返回满足此条件的任何数组作为答案
 *              提示：1 <= A.length <= 5000,  0 <= A[i] <= 5000
 *              输入：[3,1,2,4]
 *              输出：[2,4,3,1]，[4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 * @Author xugc
 * @Date 2018/9/28 0:11
 * @Version 1.0
 */
public class SortArrayByParity {

    public static int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int head=0, tail=A.length-1;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                result[head] = A[i];
                head++;
            }else{
                result[tail] = A[i];
                tail--;
            }
        }
        return result;
    }
}
