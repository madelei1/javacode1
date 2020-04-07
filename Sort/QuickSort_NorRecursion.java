package Sort;

import java.util.Arrays;
import java.util.Stack;

/**
 * 快速排序的非递归
 */
public class QuickSort_NorRecursion {

    /**
     * 获取调整后的left的位置
     * @param array
     * @param left
     * @param right
     * @return
     */
    public static int partition(int[] array,int left,int right) {
        int tmp = array[left];

        while (left < right) {
            //从后向前遍历判断，值是否比tmp小，如果比tmp小就向调整
            while (left < right && array[right] >= tmp) {
                right --;
            }
            if (left >= right) {
                break;
            }
            array[left] = array[right];
            //从前向后遍历判断，值是否比tmp大，如果比tmp大就向调整
            while (left < right && array[left] <= tmp) {
                left ++;
            }
            if (left >= right) {
                break;
            }
            array[right] = array[left];

        }
        array[left] = tmp;
        return left;
    }

    /**
     * 利用非递归进行调整
     * @param array
     * @param left
     * @param right
     * 思路：通过栈来调整，将partition()方法调用过后的pivot，
     * 来判断pivot的左右情况，如果只有一个数字，就说明这个数字是有序的了
     * 如果有多个在次调整，调整的方法就是通过pivot将数组分为三份，一份是左，一份是右，一个是pivot
     * 通过栈，将左右二边的下标开始和结束压入栈， 先压入左边，在压入右边，
     * 通过判断栈是否为空来循环
     * 通过出栈的方式来得到右边的结束和开始的下标（注意顺序），
     * 然后再次通过新的pivot来判断左右二边情况即可
     *
     */
    public static void quickNor(int[] array,int left,int right) {
        Stack<Integer> stack = new Stack();
        int pivot = partition(array,left,right);

        if (left < pivot-1) {
            stack.push(left);
            stack.push(pivot-1);
        }
        if (right > pivot+1) {
            stack.push(pivot+1);
            stack.push(right);
        }
        while (!stack.isEmpty()) {
            right = stack.pop();
            left = stack.pop();
            pivot = partition(array,left,right);
            if (left < pivot-1) {
                stack.push(left);
                stack.push(pivot-1);
            }
            if (right > pivot+1) {
                stack.push(pivot+1);
                stack.push(right);
            }
        }
    }
    public static void quickSort(int[] array){
        quickNor(array,0,array.length-1);
    }
    public static void main(String[] args) {
        int[] array = {12,4,6,9,2};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

}
