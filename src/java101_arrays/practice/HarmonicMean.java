package java101_arrays.practice;

public class HarmonicMean {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        double total=0;
        double mean;
        /*for (int i:arr) {
            total+=i;
        }
        mean=total/arr.length;
        System.out.println(mean);*/
        for (int i=0;i<arr.length;i++) {
            total+=Math.pow(arr[i],-1);
        }

        mean=arr.length/total;
        System.out.println(mean);
    }
}
