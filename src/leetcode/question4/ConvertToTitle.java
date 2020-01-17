package leetcode.question4;

/**
 * @CLassName ConvertToTitle(168)
 * @Description ����һ������������������ Excel �������Ӧ�������ơ�

 *              ���룺 28
 *              ����� AB
 * @Version 1.0
 */
public class ConvertToTitle {

    public static String convertToTitle(int n) {
        StringBuffer sbf = new StringBuffer();
        char c;
        while(n>26){
            int r = n % 26;
            if(r==0){
                sbf.append('Z');
                n = n/26 - 1;
            }else{
                n = n / 26;
                c = (char)('A' + (r-1));
                sbf.append(c);
            }
        }
        c = (char)((n-1)+'A');
        sbf.append(c);
        return sbf.reverse().toString();
    }
}
