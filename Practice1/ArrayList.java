package Practice1;

import java.util.Arrays;

public class ArrayList {
    public static void main(String[] args) {
        MyArray x = new MyArray(5);
        x.add(1);
        x.add(2);
        x.add(3);
        x.print();
        System.out.println();
        x.add(3,5);
        x.print();
        System.out.println();
        System.out.println(x.find(5));
        System.out.println(x.contains(2));
        x.print();
        System.out.println();
        x.remove(5);
        x.print();
        System.out.println();
        x.clear();
        x.print();
    }


}
class MyArray {
    private int[] num;
    private int size;

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public MyArray() {
        num = new int[16];
    }

    public MyArray(int length) {
        num = new int[length];
    }


    /**
     * 向动态数组中添加元素，默认向数组末尾添加
     * @param data
     */
    public void add(int data) {
        if (size == num.length) {
            grow();
        }
        num[size] = data;
        size ++;
    }

    /**
     * 向动态数组的任意位置插入元素
     * @param index 插入的目标索引
     * @param data
     */
    public void add(int index,int data) {
        if (rangeCheck(index)) {
            if (index == size) {
                add(data);
            } else {
                if (size == num.length) {
                    grow();
                }
                /*
            *   src - 源数组。
                srcPos - 源数组中的起始位置。
                dest - 目标数组。
                destPos - 目标数据中的起始位置。
                length - 要复制的数组元素的数量。
                */
                System.arraycopy(num,index,num,index + 1,size - index);
                num[index] = data;
                size ++;
            }
        }

    }

    /**
     * 在数组中查找是否有指定data的元素，若有返回索引
     * @param data
     * @return 找到返回元素下标，否则返回-1
     */
    public int find(int data) {
        for (int i = 0; i < size; i++) {
            if (num[i] ==data) {
                return i;
            }
        }
        System.out.println("元素不存在");
        return -1;
    }

    /**
     * 在数组中查找是否有指定元素
     * @param data
     * @return
     */
    public boolean contains(int data) {
        for (int i = 0; i < size; i++) {
            if (num[i] == data) {
                return true;
            }
        }
        return false;
    }

    /**
     * 在数组中删除第一个出现的指定内容
     * @param data
     * @return
     */
    public boolean remove(int data) {
        int i = find(data);
        if (i != -1) {
            /*
            *   src - 源数组。
                srcPos - 源数组中的起始位置。
                dest - 目标数组。
                destPos - 目标数据中的起始位置。
                length - 要复制的数组元素的数量。
                */
            System.arraycopy(num,i + 1,num,i, size - i - 1);
            num[size] = 0;
            size --;
            return true;
        }
        return false;
    }

    /**
     * 取得指定位置的元素
     * @param index
     * @return
     */
    public int get(int index) {
        //判断给定索引是否合法
        if (rangeCheck(index)) {
            return num[index];
        }
        return -1;
    }
    /**
     * 修改指定索引的内容
     * @param index 指定的元素下标
     * @param data 修改后的内容
     * @return
     */
    public boolean set(int index,int data) {
        if (rangeCheck(index)) {
            num[index] = data;
            return true;
        }
        return false;
    }
    // 返回动态数组长度
    public int size() {
        return size;
    }
    // 打印动态数组内容
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(num[i]+" ");
        }
    }
    // 清空所有数组元素
    public void clear() {
        for (int i = 0; i < size; i++) {
            num[i] = 0;
        }
    }
    //对数组进行扩容
    public void grow() {
        num = Arrays.copyOf(num,num.length << 1);
    }
    //判断给定索引是否非法
    public boolean rangeCheck(int index) {
        if (index < 0 || index > size) {
            System.out.println("索引非法");
            return false;
        }
        return true;
    }
}


