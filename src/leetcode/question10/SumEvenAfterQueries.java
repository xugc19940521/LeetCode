package leetcode.question20;

/**
 * @CLassName SumEvenAfterQueries(985)
 * @Description ����һ���������� A ��һ����ѯ���� queries��
 *             ���ڵ�?i?�β�ѯ����?val =?queries[i][0], index?= queries[i][1]��
 *             ���ǻ��?val?�ӵ�?A[index]?�ϡ�Ȼ�󣬵�?i?�β�ѯ�Ĵ��� A ��ż��ֵ�ĺ͡�
 *            ���˴������� index = queries[i][1] �Ǵ� 0 ��ʼ��������ÿ�β�ѯ���������޸����� A����
 *             �������в�ѯ�Ĵ𰸡���Ĵ�Ӧ�������� answer ������answer[i] Ϊ�� i �β�ѯ�Ĵ𰸡�
 *              ���룺A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
 *              �����[8,6,2,4]
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
