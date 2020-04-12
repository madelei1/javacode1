package MapAndSet;

public class TestDemo {
    public static void main(String[] args) {
        //8
        HashBucket hashBucket = new HashBucket();
        hashBucket.put(1, 110);
        hashBucket.put(2, 120);
        hashBucket.put(4, 114);
        hashBucket.put(12, 12120);
        int val = hashBucket.getValue(1);
        System.out.println(val);

    }
}
