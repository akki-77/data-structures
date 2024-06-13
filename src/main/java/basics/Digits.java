package basics;

import java.util.ArrayList;

public class Digits {

    public void countDigits1(int n) {
        int count = 0;
        while(n > 0) {
            n /= 10;
            count += 1;
        }
        System.out.println(count);
    }

    public void countDigits2(int n) {
        int count = 0;
        System.out.println(Math.floor(Math.log10(n)) + 1);
    }

    // Similarly you can check for palindrome as well.
public void reverseNum(int n) {
        int numCopy = n;
        int revNum = 0;
        while(n>0) {
            int lastDigit = n % 10;
            n /= 10;
            revNum = revNum*10 + lastDigit;
        }
        System.out.println(revNum);
    }

    public void printAllDivisors(int n) {
        ArrayList<Integer> divisorsList = new ArrayList<>();
        for(int i=1; i<=Math.sqrt(n); i++) {
            if(n%i == 0){
                divisorsList.add(i);
                // If n is a square number like 6^2 (n is 36)
if( i != Math.sqrt(n)) {
                    divisorsList.add(n/i);
                }
            }
        }
        System.out.println(divisorsList);
    }

    public static void main(String[] args) {
        Digits dg = new Digits();
        dg.countDigits1(52729);
        dg.countDigits2(52729);
        dg.reverseNum(1221);
        dg.printAllDivisors(36);
    }
}
