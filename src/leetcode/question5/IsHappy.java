package leetcode.question5;

import java.util.HashSet;
import java.util.Set;

/**
 * @CLassName IsHappy(202)
 * @Description ��дһ���㷨���ж�һ�����ǲ��ǡ�������������
 *              һ����������������Ϊ������һ����������ÿһ�ν������滻Ϊ��ÿ��λ���ϵ����ֵ�ƽ���ͣ�Ȼ���ظ��������ֱ���������Ϊ 1��Ҳ����������ѭ����ʼ�ձ䲻�� 1��������Ա�Ϊ 1����ô��������ǿ�������
 *
 *               ����: 19
 *               ���: true
 * @Version 1.0
 */
public class IsHappy {

    public static boolean isHappy(int n) {
        Set numbers = new HashSet();
        while(n!=1){
            int tmp = 0;
            while(n>=10){
                int x = n%10;
                tmp += x*x;
                n = n/10;
            }
            tmp += n*n;
            if(numbers.contains(tmp)){
                return false;
            }else{
                numbers.add(tmp);
            }
            n = tmp;
        }
        return true;
    }
}
