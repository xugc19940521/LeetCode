package leetcode.question2;

/**
 * @CLassName AddBinary(67)
 * @Description 给定两个二进制字符串，返回他们的和（用二进制表示）。

 *              输入： a = "11", b = "1"
 *              输出： "100"
 * @Version 1.0
 */
public class AddBinary {
    //可以先把一个存在栈里
    public static String addBinary(String a, String b) {
        int alen = a.length();
        int blen = b.length();
        StringBuffer sbf = new StringBuffer();
        int bit = 0;
        while(alen>0 && blen>0){
            char aChar = a.charAt(alen-1);
            char bChar = b.charAt(blen-1);
            if(aChar == '1' && bChar == '1'){
                if(bit == 1){
                    sbf.append('1');
                }else{
                    sbf.append('0');
                }
                bit = 1;
            }else if(aChar == '0' && bChar == '0'){
                if(bit == 1){
                    sbf.append('1');
                }else{
                    sbf.append('0');
                }
                bit = 0;
            }else{
                if(bit == 1){
                    sbf.append('0');
                    bit = 1;
                }else{
                    sbf.append('1');
                    bit = 0;
                }
            }
            alen--;
            blen--;
        }
        if(alen>0){
            for(int i=alen;i>0;i--){
                char aChar = a.charAt(i-1);
                if(aChar == '1'){
                    if(bit == 1){
                        sbf.append('0');
                        bit = 1;
                    }else{
                        sbf.append('1');
                        bit = 0;
                    }
                }else{
                    if(bit == 1){
                        sbf.append('1');
                        bit = 0;
                    }else{
                        sbf.append('0');
                        bit = 0;
                    }
                }
            }
        }

        if(blen>0){
            for(int i=blen;i>0;i--){
                char aChar = b.charAt(i-1);
                if(aChar == '1'){
                    if(bit == 1){
                        sbf.append('0');
                        bit = 1;
                    }else{
                        sbf.append('1');
                        bit = 0;
                    }
                }else{
                    if(bit == 1){
                        sbf.append('1');
                        bit = 0;
                    }else{
                        sbf.append('0');
                        bit = 0;
                    }
                }
            }
        }
        if(bit == 1){
            sbf.append('1');
        }
        return sbf.reverse().toString();
    }
}
