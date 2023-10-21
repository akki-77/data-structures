/* 3
 Swapping array elements
 [1, 2, 3, 4, 5]   >   [5, 2, 3, 4, 1]*/

import java.util.Arrays;

public class ReverseArray {

    public int[] swap(int l, int r, int[] arr) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        return arr;
    }

    public int[] swapArray(int[] arr) {
        int l=0;
        int r=arr.length-1;

        if(l<=r){
            arr = swap(l++, r--, arr);
//              OR
//            l++;
//            r--;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Inside Main!");

        ReverseArray reverseArray = new ReverseArray();
        int[] nums = {1, 2, 3, 4, 5};
        int[] res = reverseArray.swapArray(nums);
        System.out.println(Arrays.toString(res));
    }
}
