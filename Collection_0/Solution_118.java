package Collection_0;

import java.util.ArrayList;
import java.util.List;

public class Solution_118 {
    /**
     * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
     * @param numRows
     * @return
     * 思路：利用List<List<Integer>> ，可以将杨辉三角理解为一个大的List<List<Integer>>，
     * 每一行是一个List<Integer>，
     * 每一行由有不同的元素，和不同的元素个数
     */
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ret = new ArrayList<>();
        if (numRows < 1) {
            return null;
        }
        ret.add(new ArrayList<>());
        ret.get(1).add(1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();

            list.add(1);//添加第一个元素
            for (int j = 0; j <= i; j++) {
                //当i和j相等的时候添加1，不相等添加上一个和上一个的前一个
                if (i != j) {
                    list.add(ret.get(i-1).get(j-1)+ret.get(i-1).get(j));
                } else {
                    list.add(1);
                    break;
                }
            }
            ret.add(list);
        }

        return ret;
    }
    /**
     * import java.util.*;
     * class Solution {
     *     public List<List<Integer>> generate(int numRows) {
     *         List<List<Integer>> ret = new ArrayList<>();
     *         if(numRows == 0) {
     *             return ret;
     *         }
     *         ret.add(new ArrayList<>());
     *         ret.get(0).add(1);//第一行的第一个数据写入了。
     *         for(int i = 1;i < numRows;i++) {
     *             List<Integer> curRow = new ArrayList<>();
     *             curRow.add(1);//第一个元素
     *             //拿到前一行的
     *             List<Integer> prevRow = ret.get(i-1);
     *             for(int j = 1; j < i;j++) {
     *                 //公式[i,j] = [i-1,j]+[i-1,j-1]
     *                 int num = prevRow.get(j)+prevRow.get(j-1);
     *                 curRow.add(num);
     *             }
     *             curRow.add(1);//第二个元素
     *             ret.add(curRow);
     *         }
     *         return ret;
     *     }
     * }
     */
}
