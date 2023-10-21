/* 1
 Find the next greater element for each and every number of an array.*/

public class NextGreaterElement {
    public static void main(String[] args) {
        bruteForce();
    }

    public static void bruteForce() {
        int[] arr = {1,10,3,6,40,9,5,7};
        int[] res = new int[8];
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                if(arr[i] < arr[j]) {
                    res[i] = arr[j];
                    break;
                } else {
                    res[i] = -1;
                }
            }
        }
        for(int i=0; i<res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
