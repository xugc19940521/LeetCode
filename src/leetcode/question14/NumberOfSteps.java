package leetcode.question14;

/**
 * @CLassName NumberOfSteps(1342)
 * @Description 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
 *              输入：14
 *              输出：6
 * @Author xugc
 * @Date 2020/2/27
 * @Version 1.0
 */
public class NumberOfSteps {
    public static int numberOfSteps (int num) {
        int step = 0;
        while(num!=0){
            if(num%2!=0){
                num--;
            }else{
                num = num/2;
            }
            step++;
        }
        return step;
    }
}
