package myJdk.listhelper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @CLassName MapHelper
 * @Description  循环Map的几种方式
 * @Author xugc
 * @Date 2018/9/26 23:18
 * @Version 1.0
 */
public class MapHelper {


   /**
    * @method method1
    * @description 通过加强for循环map.keySet()，然后通过键key获取到value值
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
     * @description Map.Entry<String, String>的加强for循环遍历输出键key和值value
     * @author: xugc
     * @param map
     * @return 
     */
    public static void method2(HashMap<String,Object> map){
        for(Map.Entry<String, Object> entry : map.entrySet()){
            System.out.println("键 key ："+entry.getKey()+" 值value ："+entry.getValue());
        }
    }

    /**
     * @method method3
     * @description Iterator遍历获取，然后获取到Map.Entry<String, String>，再得到getKey()和getValue()
     * @author: xugc
     * @param map
     * @return
     */
    public static void method3(HashMap<String,Object> map){
        Iterator<Map.Entry<String, Object>> it=map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, Object> entry=it.next();
            System.out.println("键key ："+entry.getKey()+" value ："+entry.getValue());
        }
    }
}
