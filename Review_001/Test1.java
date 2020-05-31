package Review_001;

public class Test1 {
    public static void main(String[] args) {
        Solution_155 solution_155 = new Solution_155();
        solution_155.push(512);
        solution_155.push(-1024);
        solution_155.push(-1024);
        solution_155.push(512);
        solution_155.pop();
        System.out.println(solution_155.getMin());
        solution_155.pop();
        System.out.println(solution_155.getMin());
        solution_155.pop();
        System.out.println(solution_155.getMin());


    }
}
