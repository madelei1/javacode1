package Collection_0;

import java.util.*;

public class TestDemo_1 {
    /**
     * 练习collection的方法
     * @param args
     */
    public static void main(String[] args) {
        //Collection new Collection,和Deque需要重写抽象方法
        Collection collection = new ArrayList();
        Collection collection1 = new HashSet();
        Collection collection2 = new LinkedList();
        Collection collection3 = new PriorityQueue();
        Collection collection4 = new Collection() {
            //内部类
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        Collection collection5 = new Deque() {
            @Override
            public void addFirst(Object o) {

            }

            @Override
            public void addLast(Object o) {

            }

            @Override
            public boolean offerFirst(Object o) {
                return false;
            }

            @Override
            public boolean offerLast(Object o) {
                return false;
            }

            @Override
            public Object removeFirst() {
                return null;
            }

            @Override
            public Object removeLast() {
                return null;
            }

            @Override
            public Object pollFirst() {
                return null;
            }

            @Override
            public Object pollLast() {
                return null;
            }

            @Override
            public Object getFirst() {
                return null;
            }

            @Override
            public Object getLast() {
                return null;
            }

            @Override
            public Object peekFirst() {
                return null;
            }

            @Override
            public Object peekLast() {
                return null;
            }

            @Override
            public boolean removeFirstOccurrence(Object o) {
                return false;
            }

            @Override
            public boolean removeLastOccurrence(Object o) {
                return false;
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean offer(Object o) {
                return false;
            }

            @Override
            public Object remove() {
                return null;
            }

            @Override
            public Object poll() {
                return null;
            }

            @Override
            public Object element() {
                return null;
            }

            @Override
            public Object peek() {
                return null;
            }

            @Override
            public void push(Object o) {

            }

            @Override
            public Object pop() {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Iterator descendingIterator() {
                return null;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        int[] array = {12,6,9,4,2};
        System.out.println(collection1.add(array[0]));//true
        System.out.println(collection1.size());//1
        System.out.println(collection1.contains(12));//true
        System.out.println(collection1.add(array[1]));
        //System.out.println(collection1.add(array[2]));
        //System.out.println(collection1.add(array[3]));
        //hashCode(),打印的是collection1中数据的和
        System.out.println(collection1.hashCode());//18
        String[] string ={"world","hello","leetcode"};
        for (int i = 0; i < string.length; i++) {
            collection.add(string[i]);
        }
        String s = "1000";
        //java.lang.NumberFormatException
        // --当应用程序试图将字符串转换成一种数值类型，但该字符串不能转换为适当格式时，抛出该异常。
        //String a = "w";
        //System.out.println(Integer.parseInt(a));
        //Integer x = Integer.parseInt(string[0]);

        //System.out.println(x);
        System.out.println();
        System.out.println("------------------------");
        System.out.println(collection.hashCode());
        //String[] y = new String[string.length];

        System.out.println(Arrays.toString(collection.toArray()));//[world, hello, leetcode]
    }
}
