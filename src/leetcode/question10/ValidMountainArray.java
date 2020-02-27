package leetcode.question19;

/**
 * @CLassName ValidMountainArray(941)
 * @Description 给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。
 *               A.length >= 3
 *               在 0 < i < A.length - 1 条件下，存在 i 使得：
 *                   A[0] < A[1] < ... A[i-1] < A[i]
 *                   A[i] > A[i+1] > ... > A[A.length - 1]
 *
 *              输入：[3,5,5]
 *              输出：false
 * @Version 1.0
 */
public class ValidMountainArray {
    //其实就是先递增再递减
    public static boolean validMountainArray(int[] A) {
        int max = Integer.MIN_VALUE, index = 0;
        if(A.length<=2)return false;
        for(int i=0;i<A.length;i++){
            if(A[i] == max){
                return false;
            }else if(A[i] > max){
                max = A[i];
            }else{
                index = i-1;
                break;
            }
        }
        //index位置为最大值，后面递减
        if(index==0)return false;
        for(int i=index+1;i<A.length;i++){
            if(A[i] < max){
                max = A[i];
                continue;
            }else{
                return false;
            }
        }

        return true;
    }
}
