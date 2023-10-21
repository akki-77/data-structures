/* 2
Functional Recursion
1+2+3+4+5 > 15 */

public class NumberSum {

    public int recursiveSum(int n) {
        if(n == 0){
            return 0;
        } else {
            return n + recursiveSum(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Inside Main!");

        NumberSum numberSum = new NumberSum();
        int sum = numberSum.recursiveSum(5);
        System.out.println(sum);
    }
}
