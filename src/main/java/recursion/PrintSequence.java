/* 1
 Parametrized Recursion*/

public class PrintSequence {
    private int n;

    public void print(int i) {
        System.out.println(i);
    }
    public void recursiveFunction(int i, int num) {
        if(i<= num) {
            // print(i);   // 1,2,3,4,5

            recursiveFunction(i+1, num);

            print(i);   // 5,4,3,2,1 (Will print from the stack )
        }
    }

    public static void main(String[] args) {
        System.out.println("Inside Main!");

        PrintSequence printSequence = new PrintSequence();
        printSequence.n = 5;
        printSequence.recursiveFunction(1, printSequence.n);
    }
}