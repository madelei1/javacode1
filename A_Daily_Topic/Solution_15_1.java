package A_Daily_Topic;

public class Solution_15_1 {
    //https://www.nowcoder.com/practice/e7e0d226f1e84ba7ab8b28efc6e1aebc?tpId=8&&tqId=11065&rp=1&ru=/activity/oj&qru=/ta/cracking-the-coding-interview/question-ranking
    public static void main(String[] args) {
        Solution_15_1 solution_15_1 = new Solution_15_1();
        System.out.println(solution_15_1.addAB(1580198,2537294));

    }
    public int addAB(int A, int B) {
        int tem=0;//代表进位位
        do{
            tem=A&B;
            A=A^B;
            B=tem<<1;
        }
        while(B!=0);
        return A;
    }
}
