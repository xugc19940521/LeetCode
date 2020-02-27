package leetcode.question19;

public class ReverseOnlyLetters {

    public static String reverseOnlyLetters(String S) {
        int len = S.length();
        char[] result = new char[len];

        int left = 0, right = len-1;
        while(left<=right){
            char leftC = S.charAt(left);
            char rightC = S.charAt(right);
            if(('a'<=leftC && leftC<='z') ||('A'<=leftC && leftC<='Z')){
                if(('a'<=rightC && rightC<='z') ||('A'<=rightC && rightC<='Z')){
                    result[left] = rightC;
                    result[right] = leftC;
                    left += 1;
                    right -= 1;
                }else{
                    result[right] = rightC;
                    right -=1;
                }
            }else{
                result[left] = leftC;
                left+=1;
            }
        }
        return new String(result);
    }
}
