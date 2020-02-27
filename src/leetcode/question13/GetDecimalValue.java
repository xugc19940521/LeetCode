package leetcode.question13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @CLassName GetDecimalValue(1290)
 * @Description ����һ������������ý��?head��������ÿ������ֵ���� 0 ���� 1����֪��������һ���������ֵĶ����Ʊ�ʾ��ʽ��
 *              ���㷵�ظ���������ʾ���ֵ� ʮ����ֵ ��
 *              ������ָ���ǣ���������ѧ���� �ǵݼ� �߶����еı�Ҫ�ƶ�������
 *              ���룺head = [1,0,1]
 *              �����5
 * @Author xugc
 * @Date 2020/2/9
 * @Version 1.0
 */
public class GetDecimalValue {

     public static class ListNode {
         public int val;
         public ListNode next;
         public ListNode(int x) { val = x; }
     }

    public static int getDecimalValue(ListNode head) {
        ArrayList a = new ArrayList();
        while(head.next != null){
            a.add(head.val);
            head = head.next;
        }
        a.add(head.val);
        Collections.reverse(a);
        Iterator it = a.iterator();
        int num = 1, sum = 0;
        while(it.hasNext()){
            sum += (Integer) (it.next()) * num;
            num = num*2;
        }
        return sum;
    }
}
