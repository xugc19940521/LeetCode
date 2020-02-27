package leetcode.question3;

/**
 * @CLassName AddDigits(258)
 * @Description     ����һ���Ǹ����� num������������λ�ϵ�������ӣ�ֱ�����Ϊһλ����
 *                  ����: 38
 *                  ���: 2
 *                  ����: ��λ��ӵĹ���Ϊ��3 + 8 = 11, 1 + 1 = 2�� ���� 2 ��һλ�������Է��� 2��
 *                  ���ף�����Բ�ʹ��ѭ�����ߵݹ飬���� O(1) ʱ�临�Ӷ��ڽ�����������
 * @Author xugc
 * @Date 2018/10/1 9:11
 * @Version 1.0
 */
public class AddDigits {
    public static int addDigits(int num) {
        if(num==0)return 0;
        if(num%9==0)return 9;
        return num%9;
    }
}
