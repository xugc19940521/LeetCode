package leetcode.question11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @CLassName CheckPerfectNumber(507)
 * @Description ����һ�� ��������������ͳ������������������������֮����ȣ����ǳ���Ϊ������������
 *              ����һ�� ���� n�� ������������������� True�����򷵻� False
 * @Version 1.0
 */
public class CheckPerfectNumber {

    public static boolean checkPerfectNumber(int num) {
        if(num == 0) return false;
        Set<Integer> a = new HashSet();
        for(int i=num/2;i>0;i--){
            if(num%i == 0){
                a.add(i);
            }
        }
        Iterator itr = a.iterator();
        while(itr.hasNext()){
            num = num - (Integer)itr.next();
        }

        return num == 0;
    }
}
