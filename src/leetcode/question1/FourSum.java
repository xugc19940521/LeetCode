package leetcode.question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @CLassName FourSum(18)
 * @Description ����һ������?n ������������?nums?��һ��Ŀ��ֵ?target���ж�?nums?���Ƿ�����ĸ�Ԫ�� a��b��c?�� d?��
 *              ʹ��?a + b + c + d?��ֵ��?target?��ȣ��ҳ��������������Ҳ��ظ�����Ԫ�顣
 *              ���в����԰����ظ�����Ԫ�顣
 *              ���룺nums = [1, 0, -1, 0, -2, 2]���� target = 0��
 *              �����[[-1,  0, 0, 1],[-2, -1, 1, 2],[-2,  0, 0, 2]]
 * @Version 1.0
 */
public class FourSum {
    //[-493,-482,-482,-456,-427,-405,-392,-385,-351,-269,-259,-251,-235,-235,-202,-201,-194,-189,-187,-186,-180,-177,-175,-156,-150,-147,-140,-122,-112,-112,-105,-98,-49,-38,-35,-34,-18,20,52,53,57,76,124,126,128,132,142,147,157,180,207,227,274,296,311,334,336,337,339,349,354,363,372,378,383,413,431,471,474,481,492]
            //6189
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList();
        HashMap<ArrayList, Integer> map = new HashMap<>();
        map.put(new ArrayList(), 0);
        for(int i=0;i<nums.length;i++){
            HashMap<ArrayList, Integer> map2 = new HashMap<>();
            for(ArrayList a : map.keySet()){
                if(a.size()>=4) continue;
                ArrayList b = (ArrayList) a.clone();
                b.add(nums[i]);
                int value = map.get(a)+nums[i];
                map2.put(b, value);
                if(value==target && b.size()==4 && !result.contains(b)){
                    result.add(b);
                }
            }
            map.putAll(map2);
        }
        return result;
    }

    public static List<List<Integer>> fourSum2(int[] nums,int target){
        List<List<Integer>> result=new ArrayList<>();
        if(nums==null||nums.length<4){
            return result;
        }
        Arrays.sort(nums);
        int length=nums.length;
        /*����4��ָ��k��i��j��h  k��0��ʼ������i��k+1��ʼ����������j��h��jָ��i+1��hָ���������ֵ*/
        for(int k=0;k<length-3;k++){
            /*��k��ֵ��ǰ���ֵ���ʱ����*/
            if(k>0&&nums[k]==nums[k-1]){
                continue;
            }
            /*��ȡ��ǰ��Сֵ�������Сֵ��Ŀ��ֵ��˵������Խ��Խ���ֵ����ûϷ*/
            int min1=nums[k]+nums[k+1]+nums[k+2]+nums[k+3];
            if(min1>target){
                break;
            }
            /*��ȡ��ǰ���ֵ��������ֵ��Ŀ��ֵС��˵������Խ��ԽС��ֵ����ûϷ������*/
            int max1=nums[k]+nums[length-1]+nums[length-2]+nums[length-3];
            if(max1<target){
                continue;
            }
            /*�ڶ���ѭ��i����ʼֵָ��k+1*/
            for(int i=k+1;i<length-2;i++){
                /*��i��ֵ��ǰ���ֵ���ʱ����*/
                if(i>k+1&&nums[i]==nums[i-1]){
                    continue;
                }
                /*����ָ��jָ��i+1*/
                int j=i+1;
                /*����ָ��hָ������ĩβ*/
                int h=length-1;
                /*��ȡ��ǰ��Сֵ�������Сֵ��Ŀ��ֵ��˵������Խ��Խ���ֵ����ûϷ������*/
                int min=nums[k]+nums[i]+nums[j]+nums[j+1];
                if(min>target){
                    continue;
                }
                /*��ȡ��ǰ���ֵ��������ֵ��Ŀ��ֵС��˵������Խ��ԽС��ֵ����ûϷ������*/
                int max=nums[k]+nums[i]+nums[h]+nums[h-1];
                if(max<target){
                    continue;
                }
                /*��ʼjָ���hָ��ı��ݣ����㵱ǰ�ͣ��������Ŀ��ֵ��j++��ȥ�أ�h--��ȥ�أ�����ǰ�ʹ���Ŀ��ֵʱh--������ǰ��С��Ŀ��ֵʱj++*/
                while (j<h){
                    int curr=nums[k]+nums[i]+nums[j]+nums[h];
                    if(curr==target){
                        result.add(Arrays.asList(nums[k],nums[i],nums[j],nums[h]));
                        j++;
                        while(j<h&&nums[j]==nums[j-1]){
                            j++;
                        }
                        h--;
                        while(j<h&&i<h&&nums[h]==nums[h+1]){
                            h--;
                        }
                    }else if(curr>target){
                        h--;
                    }else {
                        j++;
                    }
                }
            }
        }
        return result;
    }

}
