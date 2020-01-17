package leetcode.question23;

/**
 * @CLassName DefangIPaddr(1108)
 * @Description ����һ����Ч�� IPv4 ��ַ address��������� IP ��ַ����Ч���汾��
 *              ��ν��Ч�� IP ��ַ����ʵ������ "[.]" ������ÿ�� "."��
 *              ���룺address = "1.1.1.1"
 *              �����"1[.]1[.]1[.]1"
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
