/* 4
Find Fibonacci  Recursion
0 1 1 2 3 */

public class Fibonacci {

//    Space complexity - O(2^n)
    public int findFib(int n) {
        if(n<=1) {
            return n;
        }
        /* In case of multiple recursion call 2nd recursion call will start only when 1st one is completed. i.e. Synchronously.
         So first complete recursion tree for findFib(n-1) will be completed then only findFib(n-2) will start getting executed.*/
        return findFib(n-1) + findFib(n-2);

       /* OR
        last = findFib(n-1);
        sLast = findFib(n-2);
        return last + sLast;*/

    }

    public int optimizedFib(int n) {
//       Need to store the already calculated recursion values.
        int[] hashArr = new int[n];
        int last;
        int sLast;

        for(int i=0; i<n; i++){
            hashArr[i] = -1;
        }

        if(n<=1) {
            return n;
        }

        if(hashArr[n-1] == -1) {
            hashArr[n-1] = optimizedFib(n-1);
        }

        if(hashArr[n-2] == -1) {
            hashArr[n-2] = optimizedFib(n-2);
        }
        last = hashArr[n-1];
        sLast = hashArr[n-2];

        return last + sLast;
    }

    public static void main(String[] args) {
        Fibonacci fb = new Fibonacci();

        int result = fb.optimizedFib(10);
        System.out.println(result);
    }
}