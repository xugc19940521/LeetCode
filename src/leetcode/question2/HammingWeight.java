package leetcode.question2;

/**
 * @CLassName HammingWeight(191)
 * @Description ��дһ��������������һ���޷�������������������Ʊ��ʽ������λ��Ϊ ��1�� �ĸ�����Ҳ����Ϊ��������������
 *              ���룺x = 00000000000000000000000000001011
 *              �����3
 * @Author xugc
 * @Date 2020/2/27
 * @Version 1.0
 */
public class HammingWeight {

    public static int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
