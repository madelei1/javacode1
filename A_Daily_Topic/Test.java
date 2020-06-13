package A_Daily_Topic;

public class Test {
    public static void main(String[] args) {
        /*String s = "1234 123 123456789";
        String[] b = s.split(" ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }*/
        /*int x = 4;
        System.out.println(Math.sqrt(x));*/
        int[][] arr = {{1},{2,2},{2,2,2}};
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
