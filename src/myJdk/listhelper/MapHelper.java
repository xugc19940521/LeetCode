package myJdk.listhelper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @CLassName MapHelper
 * @Description  ѭ��Map�ļ��ַ�ʽ
 * @Author xugc
 * @Date 2018/9/26 23:18
 * @Version 1.0
 */
public class MapHelper {


   /**
    * @method method1
    * @description ͨ����ǿforѭ��map.keySet()��Ȼ��ͨ����key��ȡ��valueֵ
    * @author: xugc
    * @param map
    * @return
    */
    public static void method1(HashMap<String,Object> map){
        for(String s:map.keySet()){
            System.out.println(s + ":" + map.get(s));
        }
    }

    /**
     * @method  method2
     * @description Map.Entry<String, String>�ļ�ǿforѭ�����������key��ֵvalue
     * @author: xugc
     * @param map
     * @return 
     */
    public static void method2(HashMap<String,Object> map){
        for(Map.Entry<String, Object> entry : map.entrySet()){
            System.out.println("�� key ��"+entry.getKey()+" ֵvalue ��"+entry.getValue());
        }
    }

    /**
     * @method method3
     * @description Iterator������ȡ��Ȼ���ȡ��Map.Entry<String, String>���ٵõ�getKey()��getValue()
     * @author: xugc
     * @param map
     * @return
     */
    public static void method3(HashMap<String,Object> map){
        Iterator<Map.Entry<String, Object>> it=map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, Object> entry=it.next();
            System.out.println("��key ��"+entry.getKey()+" value ��"+entry.getValue());
        }
    }
}
