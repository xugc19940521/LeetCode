package leetcode.question18;


/**
 * @CLassName IsMonotonic(896)
 * @Description ��������ǵ��������򵥵��ݼ��ģ���ô���ǵ����ġ�
 *              ����������� i <= j��A[i] <= A[j]����ô���� A �ǵ��������ġ� ����������� i <= j��A[i]> = A[j]����ô���� A �ǵ����ݼ��ġ�
 *             ������������ A?�ǵ�������ʱ���� true�����򷵻� false��
 *
 *              ���룺[6,5,4,4]
 *              �����true
 * @Version 1.0
 */
public class IsMonotonic {

    public static boolean isMonotonic(int[] A) {
        if(A.length <= 2) return true;
        int addNum = 0, subNum = 0;
        for(int i=1;i<A.length-1;i++){
            if(A[i-1] == A[i] && A[i] == A[i+1]){
                continue;
            }else if((A[i-1] <= A[i] && A[i] <= A[i+1])){//����
                addNum += 1;
                if(subNum>0){
                    return false;
                }
                continue;
            }else if((A[i-1] >= A[i] && A[i] >= A[i+1])){//�ݼ�
                subNum += 1;
                if(addNum>0){
                    return false;
                }
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
