/* 5

Find Sub Sequences of an Array
{3,1,2} > {}, {3}, {1}, {2}, {3,1}, {1,2}, {3,2}, {3,1,2}  >  Total - 8


                                                    f(0, {})

                             f(1, {3})                                      f(1, {})

            f(2, {3,1})             f(2, {3})                       f(2, {1})              f(2, {})

f(3, {3,1,2})  f(3, {3,1})    f(3, {3,2})  f(3, {3})        f(3, {1,2})  f(3, {1})     f(3, {2})  f(3, {})

 */


import java.util.ArrayList;

public class SubSequence {

    public void findSubSeq(int ind, int[] arr, ArrayList<Integer> ds) {

        if(ind >= arr.length) {
            System.out.print(ds);
            System.out.println();
            return;
        }

        // Take
        ds.add(arr[ind]);
        findSubSeq(ind+1, arr, ds);

        // Not Take
        ds.remove(ds.size() - 1);
        findSubSeq(ind+1, arr, ds);
    }

    public static void main(String[] args) {
        SubSequence subSequence = new SubSequence();
        int[] arr = {3,1,2};
        ArrayList<Integer> ds = new ArrayList<>();

        subSequence.findSubSeq(0, arr, ds);
    }
}