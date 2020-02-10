package leetcode.question13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @CLassName GetDecimalValue(1290)
 * @Description 给你一个单链表的引用结点?head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
 *              请你返回该链表所表示数字的 十进制值 。
 *              该人数指的是：能让所有学生以 非递减 高度排列的必要移动人数。
 *              输入：head = [1,0,1]
 *              输出：5
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
