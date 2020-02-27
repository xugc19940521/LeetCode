package leetcode.question20;

/**
 * @CLassName SumEvenAfterQueries(985)
 * @Description 给出一个整数数组 A 和一个查询数组 queries。
 *             对于第?i?次查询，有?val =?queries[i][0], index?= queries[i][1]，
 *             我们会把?val?加到?A[index]?上。然后，第?i?次查询的答案是 A 中偶数值的和。
 *            （此处给定的 index = queries[i][1] 是从 0 开始的索引，每次查询都会永久修改数组 A。）
 *             返回所有查询的答案。你的答案应当以数组 answer 给出，answer[i] 为第 i 次查询的答案。
 *              输入：A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
 *              输出：[8,6,2,4]
 * @Author xugc
 * @Date 2019/2/25
 * @Version 1.0
 */
public class SumEvenAfterQueries {

    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
         int resultLength = queries.length;
         int[] result = new int[resultLength];
         int sum = 0;
         for(int i=0;i<A.length;i++){
             if(A[i]%2 != 0){
                 continue;
             }else{
                 sum += A[i];
             }
         }
         for(int i=0;i<resultLength;i++){
             int value = queries[i][0];
             int index = queries[i][1];

             if((A[index] + value) %2 !=0){
                 if(value%2 == 0){
                     A[index] = A[index] + value;
                 }else{
                     sum = sum - A[index];
                     A[index] = A[index] + value;
                 }
             }else{
                 if(value%2 == 0){
                     int temp = A[index];
                     A[index] = A[index] + value;
                     sum = sum + value;
                 }else{
                     A[index] = A[index] + value;
                     sum = sum + A[index];
                 }
             }
             result[i] = sum;

         }
         return result;
    }

}
