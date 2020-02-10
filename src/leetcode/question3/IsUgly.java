package leetcode.question3;

/**
 * @CLassName IsUgly(263)
 * @Description ��дһ�������жϸ��������Ƿ�Ϊ������
 *              ��������ֻ���������� 2, 3, 5 ����������
 *               ����: 6
 *               ���: true
 * @Version 1.0
 */
public class IsUgly {
    public static boolean isUgly(int num) {
        if(num ==0) return false;
        s: while(num!=1){
            if(num%2==0){
                num = num/2;
                continue s;
            }
            if(num%3==0){
                num = num/3;
                continue s;
            }
            if(num%5==0){
                num = num/5;
                continue s;
            }
            return false;
        }
        return true;
    }
}
