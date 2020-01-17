package leetcode.question23;

/**
 * @CLassName DefangIPaddr(1108)
 * @Description 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 *              所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 *              输入：address = "1.1.1.1"
 *              输出："1[.]1[.]1[.]1"
 * @Version 1.0
 */
public class DefangIPaddr {

    public static String defangIPaddr(String address) {
        String[] addresses = address.split("\\.");
        StringBuffer sbf = new StringBuffer();
        for(int i=0;i<addresses.length;i++){
            sbf.append(addresses[i]);
            if(i!=addresses.length-1){
                sbf.append("[.]");
            }
        }
        return sbf.toString();
    }
}
