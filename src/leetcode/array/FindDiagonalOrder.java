package leetcode.array;

/**
 * @CLassName FindDiagonalOrder
 * @Description ����һ������ M x N ��Ԫ�صľ���M�У�N�У������ԶԽ��߱�����˳�򷵻���������е�����Ԫ�أ��Խ��߱�������ͼ��ʾ��
 *              ����:
 *              [
 *                  [ 1, 2, 3 ],
 *                  [ 4, 5, 6 ],
 *                  [ 7, 8, 9 ]
 *              ]
 *              �����[1,2,4,7,5,3,6,8,9]
 * @Author xugc
 * @Date 2018/9/28 8:01
 * @Version 1.0
 */
public class FindDiagonalOrder {

    public static int[] findDiagonalOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] result = new int[row*col];

        int xNum = 0, yNum = 0, index = 0;
        boolean flag = true;
        result[0] = matrix[0][0];
        while(xNum != row-1 || yNum != col-1){
            int xTemp = 0, yTemp = 0;
            if(flag){//����
                xTemp = xNum-1;
                yTemp = yNum+1;
            }else{
                xTemp = xNum+1;
                yTemp = yNum-1;
            }

            if(xTemp < 0 || yTemp < 0 || yTemp > row-1 || xTemp > col-1){
                flag = !flag;
            }

            if (xTemp < 0) {
                xNum = 0;
            }else if(xTemp > row-1){
                xNum = row-1;
                yNum = yNum+1;
            }else{
                xNum = xTemp;
            }
            if(yTemp < 0){
                yNum = 0;
            }else if(yTemp > col-1){
                yNum = col-1;
                xNum = xNum+1;
            }else{
                yNum = yTemp;
            }
            index++;
            result[index] = matrix[xNum][yNum];
        }
        return result;
    }
}
