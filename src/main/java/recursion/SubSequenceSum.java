/* 6
Find Sub Sequences of an Array
{1,2,1}  Sum 2 >
A >  Any subsequence which matches with the sum - {1,1} / {2} (You can print any.)
B >  Total number of subseuence which matches with the sum - 2    i.e. {1,1} {2}
 */

import java.util.ArrayList;

public class SubSequenceSum {

//    Global Variable
    private int totalSubSequence = 0;

    public void totalSubsequenceWithMatchingSum(int ind, int[] arr, ArrayList<Integer> ds, int sum) {
        if(ind >= arr.length) {
            int total = 0;
            for(int num : ds) {
                total += num;
            }
            if(total == sum) {
                totalSubSequence += 1;
            }
            return;
        }

//      Pick
        ds.add(arr[ind]);
        totalSubsequenceWithMatchingSum(ind+1, arr, ds, sum);

//      Not Pick
        ds.remove(ds.size() - 1);
        totalSubsequenceWithMatchingSum(ind+1, arr, ds, sum);
    }

    public void findAllSubSeqWithSum(int ind, int[] arr, ArrayList<Integer> ds, int sum) {
        if(ind >= arr.length) {
            int total = 0;
            for(int num : ds) {
                total += num;
            }
            if(total == sum) {
                System.out.print(ds);
                System.out.println();
            }
            return;
        }

//      Pick
        ds.add(arr[ind]);
        findAllSubSeqWithSum(ind+1, arr, ds, sum);

//        Not Pick
        ds.remove(ds.size() - 1);
        findAllSubSeqWithSum(ind+1, arr, ds, sum);
    }

    public boolean findAnySubSeqWithSum(int ind, int[] arr, ArrayList<Integer> ds, int sum) {

        if(ind >= arr.length) {
            int total = 0;
            for(Integer num : ds) {
                total += num;
            }
            if(total == sum) {
                System.out.print(ds);
                System.out.println();
                return true;
            }
            return false;
        }

//      Pick
        ds.add(arr[ind]);
        if (findAnySubSeqWithSum(ind+1, arr, ds, sum)) {
            return true;
        }

//        Not Pick
        ds.remove(ds.size() - 1);
        if (findAnySubSeqWithSum(ind+1, arr, ds, sum)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        SubSequenceSum subSequenceSum = new SubSequenceSum();
        int[] arr = {1,2,1};
        int sum = 2;
        ArrayList<Integer> ds = new ArrayList<>();

//        FInd all subsequences with the matching sum.
//        subSequenceSum.findAllSubSeqWithSum(0, arr, ds, sum);

//        Find any subsequence with the matching sum.
//        subSequenceSum.findAnySubSeqWithSum(0, arr, ds, sum);

//        Find total subsequences with the matching sum.
        subSequenceSum.totalSubsequenceWithMatchingSum(0, arr, ds, sum);
        System.out.println(subSequenceSum.totalSubSequence);
    }
}