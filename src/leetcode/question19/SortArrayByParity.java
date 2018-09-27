package leetcode.question19;

/**
 * @CLassName SortArrayByParity(905)
 * @Description ����һ���Ǹ��������� A������һ���� A ������ż��Ԫ����ɵ����飬����� A ����������Ԫ�ء�
 *              ����Է���������������κ�������Ϊ��
 *              ��ʾ��1 <= A.length <= 5000,  0 <= A[i] <= 5000
 *              ���룺[3,1,2,4]
 *              �����[2,4,3,1]��[4,2,3,1]��[2,4,1,3] �� [4,2,1,3] Ҳ�ᱻ���ܡ�
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
