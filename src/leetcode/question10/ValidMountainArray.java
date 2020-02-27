package leetcode.question19;

/**
 * @CLassName ValidMountainArray(941)
 * @Description ����һ���������� A�����������Ч��ɽ������ͷ��� true�����򷵻� false��
 *               A.length >= 3
 *               �� 0 < i < A.length - 1 �����£����� i ʹ�ã�
 *                   A[0] < A[1] < ... A[i-1] < A[i]
 *                   A[i] > A[i+1] > ... > A[A.length - 1]
 *
 *              ���룺[3,5,5]
 *              �����false
 * @Version 1.0
 */
public class ValidMountainArray {
    //��ʵ�����ȵ����ٵݼ�
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
        //indexλ��Ϊ���ֵ������ݼ�
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
