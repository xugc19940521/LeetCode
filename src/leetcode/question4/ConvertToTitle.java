package leetcode.question4;

/**
 * @CLassName ConvertToTitle(168)
 * @Description 给定一个正整数，返回它在 Excel 表中相对应的列名称。

 *              输入： 28
 *              输出： AB
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
