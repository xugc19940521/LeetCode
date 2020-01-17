package leetcode.question4;

/**
 * @CLassName TitleToNumber(171)
 * @Description ����һ��Excel����е������ƣ���������Ӧ������š�

 *              ���룺 AB  ,A  ,B  ,Z
 *              ����� 28  ,1  ,2  ,26
 * @Version 1.0
 */
public class TitleToNumber {

    public static int titleToNumber(String s) {
        int divisor = 1, result = 0;
        for(int i=s.length()-1;i>=0;i--){
            int num = (s.charAt(i)-'A'+1) * divisor;
            result += num;
            divisor = divisor * 26;
        }
        return result;
    }
}
