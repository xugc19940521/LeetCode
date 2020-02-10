package leetcode.question13;

/**
 * @CLassName ReplaceElements(1299)
 * @Description ����һ������ arr �����㽫ÿ��Ԫ�������ұ�����Ԫ���滻����������һ��Ԫ�أ��� -1 �滻��
 *              ��������滻���������㷵��������顣
 *              ���룺arr = [17,18,5,4,6,1]
 *              �����[18,6,6,6,1,-1]
 * @Author xugc
 * @Date 2020/2/9
 * @Version 1.0
 */
public class ReplaceElements {
    public static int[] replaceElements(int[] arr) {
        int[] r = new int[arr.length];
        int max = -1;
        for(int i=arr.length-1;i>=0;i--){
            r[i] = max;
            max = Math.max(max, arr[i]);
        }
        return r;
    }
}
