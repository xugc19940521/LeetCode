package leetcode.question9;


/**
 * @CLassName CountSegments(434)
 * @Description ͳ���ַ����еĵ��ʸ���������ĵ���ָ���������Ĳ��ǿո���ַ���
 *              ��ע�⣬����Լٶ��ַ����ﲻ�����κβ��ɴ�ӡ���ַ���
 *              ���룺"Hello, my name is John"
 *              ����� 5
 * @Version 1.0
 */
public class CountSegments {

    public static int countSegments(String s) {
        return (s == null || s.trim().length() == 0) ? 0 : s.trim().split("\\s+").length;
    }
}
