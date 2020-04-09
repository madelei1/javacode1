import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-03-28
 * Time: 17:30
 */
public class TestSort {

    /**
     * 时间复杂度：
     * 最坏情况下：O(n^2)   最好情况：O(n)
     * 空间复杂度：O(1)
     * 稳定性：稳定的排序
     * 特点：就是数据越有序用直接插入排序 ===》 越快
     * @param array
     */
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j;
            for (j = i-1; j >= 0 ; j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    //前面已经有序了
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }

    //直接插入排序
    public static void shell(int[] array,int gap) {
        for (int i = gap; i < array.length; i++) {
            int tmp = array[i];
            int j;
            for (j = i-gap; j >= 0 ; j -= gap) {
                if(array[j] > tmp) {
                    array[j+gap] = array[j];
                }else {
                    //前面已经有序了
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }

    /**
     * 思想：分组的思想。
     * 时间复杂度：
     * 最好：有序 O(n)    最坏 O(n^2)
     * 空间复杂度：O(1)
     * 稳定性：不稳定的排序
     * @param array
     */

    public  static void shellSort(int[] array) {
        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }
    }

    /**
     * 思想：每次从待排序数字的后面 选取一个比当前数字小的数据进行交换
     * 直到把当前的序列遍历完成
     * 时间复杂度：O(n^2)   不分好坏
     * 空间复杂度：O(1)
     * 稳定性：不稳定的排序
     * @param array
     */
    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void adjustDown(int[] array,int root,int len) {
        int parent = root;
        int child = 2*parent+1;
        //最起码有左子树
        while (child < len) {
            //1、(child+1 < len)  证明有右孩子的 --》 找到左右孩子的最大值
            if( (child+1 < len) && array[child] < array[child+1]) {
                child++;//child保存的是左右孩子最大值的下标
            }
            if(array[child] > array[parent]) {
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
                parent = child;//为什么他还要指向孩子  因为 无法确定是否此树调整完毕
                child = 2*parent+1;
            }else {
                break; //不需要进行调整了
            }
        }
    }

    public static void createHeap(int[] array) {
        //i  代表每棵子树的根节点
        for (int i = (array.length-1-1)/2; i >= 0 ; i--) {
            adjustDown(array,i,array.length);
        }
    }

    /**
     * 时间复杂度：O(nlogn)
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     * @param array
     */
    public static void heapSort(int[] array) {
        //1、创建大根堆
        createHeap(array);
        //2、堆顶元素和最后一个元素进行交换
        int end = array.length-1;
        while (end > 0) {
            int tmp = array[0];
            array[0] = array[end];
            array[end] = tmp;
            adjustDown(array,0,end);
            end--;
        }
    }

    /**
     * 时间复杂度：
     * 最坏、最好：O(n^2)      优化flg之后  你才可以说  当前的时间复杂度最好情况下是：O(n)
     * 空间复杂度：O(1)
     * 稳定性：稳定
     * @param array
     */
    public static void bubbleSort(int[] array) {
        boolean flg = false;
        for (int i = 0; i < array.length-1; i++) {
            flg = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            //if(flg == false) {
            if(!flg) {
                break;
            }
        }
    }

    public static int partion(int[] array,int left,int right) {

        int tmp = array[left];

        while (left < right) {
            //1、在后面找到比tmp小的数据
            while (left < right && array[right] >= tmp) {
                right--;
            }
            if(left >= right) {
                break;
            }else {
                array[left] = array[right];
            }
            //2、在前面找到比tmp大的数据
            while (left < right && array[left] <= tmp) {
                left++;
            }
            if(left >= right) {
                break;
            }else {
                array[right] = array[left];
            }

        }
        //相遇之后
        array[left] = tmp;
        return left;
    }

    public static void insert_Sort(int[] array,int start,int end) {
        for (int i = start+1; i <= end; i++) {
            int tmp = array[i];
            int j;
            for (j = i-1; j >= start ; j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    //前面已经有序了
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }

    public static void swap(int[] array,int x1,int x2) {
        int tmp = array[x1];
        array[x1] = array[x2];
        array[x2] = tmp;
    }

    public static void selectPivotMedianOfThree(int[] array,int left,int right) {
        int mid = (right+left) >>> 1;
        if(array[left] > array[right]) {
            swap(array,left,right);
        }//array[left] <= array[right]
        if(array[left] < array[mid]) {
            swap(array,left,right);
        }//array[left] >= array[mid]
        if(array[mid] > array[right]) {
            swap(array,mid,right);
        }//array[mid] <= array[right]

        //array[mid] <= array[left] <= array[right];
    }

    public static void quick(int[] array,int start,int end) {
        //结束条件
        if(start >= end) {
            return;
        }
        //优化方式一：针对的是：在递归过程当中  这个区间的数字规模 变得很小且越来越有序
        //3 4 5 6 7
        if(end-start+1 <= 100) {
            insert_Sort(array,start,end);
            return;//必须加return
        }
        //优化方式2：正对数据有序的情况下
        //功能：让start下标的值 尽可能能够在 下面的partion函数当中  能够均匀的划分待排序序列
        selectPivotMedianOfThree(array,start,end);

        int pivot = partion(array,start,end);
        quick(array,start,pivot-1);
        quick(array,pivot+1,end);
    }

    /**
     *
     * @param array
     * @param start
     * @param end
     */
    public static void quickNor(int[] array,int start,int end) {
        Stack<Integer> stack = new Stack<>();
        int low = start;
        int high = end;
        //先划分
        int pivot = partion(array,start,end);
        //左边有两个元素
        if(pivot > low+1) {
            stack.push(low);
            stack.push(pivot-1);
        }
        if(pivot < high-1) {
            stack.push(pivot+1);
            stack.push(high);
        }
        while (!stack.empty()) {
            high = stack.pop();
            low = stack.pop();
            pivot = partion(array,low,high);
            if(pivot > low+1) {
                stack.push(low);
                stack.push(pivot-1);
            }
            if(pivot < high-1) {
                stack.push(pivot+1);
                stack.push(high);
            }
        }
    }

    /**
     * 时间复杂度：nlogn       最坏：O(n^2)
     * 空间复杂度：logn         O(n)
     * 稳定性：不稳定排序
     * @param array
     */
    public static void quickSort(int[] array) {
        quickNor(array,0,array.length-1);
    }

    public static void merge(int[] array,int low,int mid,int high) {

        int s1 = low;//表示第一个归并段的开始下标
        int s2 = mid+1;//表示第二个归并段的开始下标
        int len = high-low+1;
        int[] tmp = new int[len];//每次的归并段合并之后的数组大小
        int i= 0;//是临时数组tmp的下标

        //两个归并段是都有数据的
        while (s1 <= mid && s2 <= high) {
            if(array[s1] <= array[s2]) {
                tmp[i++] = array[s1++];
                //i++;  s1++;
            }else {
                tmp[i++] = array[s2++];
            }
        }
        //证明第一个归并段还有数据
        while (s1 <= mid) {
            tmp[i++] = array[s1++];
        }
        //进入循环说明  第二个归并段有数据
        while (s2 <= high) {
            tmp[i++] = array[s2++];
        }
        //把临时数组内的数据  拷贝到原有的数组当中
        for (int j = 0; j < len; j++) {
            array[low+j] = tmp[j];
        }

    }
    public static void mergeSortInternal(int[] array,int low,int high) {
        if(low >= high) return;//截止条件---》分解完毕
        int mid = (low+high) >>> 1;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid+1,high);
        //合并
        merge(array,low,mid,high);
    }

    /**
     * 时间复杂度：O(nlog2)
     * 空间复杂度：O(n)
     * 稳定性：稳定的排序
     * @param array
     */
    public static void mergeSort1(int[] array){
        mergeSortInternal(array,0,array.length-1);
    }

    /**
     * 非递归实现归并排序
     * @param array
     * @param gap
     */
    public static void merge2(int[] array,int gap) {
        int[] tmp = new int[array.length];
        int k = 0;//
        int s1 = 0;
        int e1 = s1+gap-1;
        int s2 = e1+1;
        int e2 = s2+gap-1 >= array.length ? array.length-1 : s2+gap-1;
        //判断是否有两个归并段  -->让s2合法
        while (s2 < array.length) {
            //开始比较
            while (s1 <= e1 && s2 <= e2) {
                if(array[s1] <= array[s2]) {
                    tmp[k++] = array[s1++];
                }else {
                    tmp[k++] = array[s2++];
                }
            }
            while (s1 <= e1) {
                tmp[k++] = array[s1++];
            }
            while (s2 <= e2) {
                tmp[k++] = array[s2++];
            }
            //代码走到这里：====》说明的是 归并了一部分了
            s1 = e2+1;
            e1 = s1+gap-1;
            s2 = e1+1;
            e2 = s2+gap-1 >= array.length ? array.length-1 : s2+gap-1;
        }
        //:--->根本没有第二个归并段了
        while (s1 <= array.length-1) {
            tmp[k++] = array[s1++];
        }
        //所有的数据 全部放到了tmp数组当中
        for (int i = 0; i < tmp.length ; i++) {
            array[i] = tmp[i];
        }
    }

    public static void mergeSort (int[] array){
        for (int gap = 1; gap < array.length; gap *= 2) {
            merge2(array,gap);
        }
    }

    public static void main2(String[] args) {
        int[] array = new int[100_0000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            //array[i] = random.nextInt(100_0000);
            array[i] = i;
        }
        long startTime = System.currentTimeMillis();
        mergeSort(array);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }

    public static void main(String[] args) {
        int[] array = {12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
