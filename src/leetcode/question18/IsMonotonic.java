package leetcode.question18;


/**
 * @CLassName IsMonotonic(896)
 * @Description 如果数组是单调递增或单调递减的，那么它是单调的。
 *              如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
 *             当给定的数组 A?是单调数组时返回 true，否则返回 false。
 *
 *              输入：[6,5,4,4]
 *              输出：true
 * @Version 1.0
 */
public class IsMonotonic {

    public static boolean isMonotonic(int[] A) {
        if(A.length <= 2) return true;
        int addNum = 0, subNum = 0;
        for(int i=1;i<A.length-1;i++){
            if(A[i-1] == A[i] && A[i] == A[i+1]){
                continue;
            }else if((A[i-1] <= A[i] && A[i] <= A[i+1])){//递增
                addNum += 1;
                if(subNum>0){
                    return false;
                }
                continue;
            }else if((A[i-1] >= A[i] && A[i] >= A[i+1])){//递减
                subNum += 1;
                if(addNum>0){
                    return false;
                }
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
