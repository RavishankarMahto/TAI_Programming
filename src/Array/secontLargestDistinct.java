package Array;

import java.util.Scanner;

public class secontLargestDistinct {

    public static int secondLargest(int[] arr){
        int firstLargest = arr[0];
        int secondLargest = Integer.MIN_VALUE;  // if secondLargest not found return -1 value
        boolean found = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
                found = true;
            }
            else if(arr[i]>secondLargest && arr[i] != firstLargest){
                secondLargest = arr[i];
                found  = true;
            }                                    // condition ==>  If there is no distinct second largest element, the output should be -1.
        }
        if(!found){
            return -1;
        }
        else{
            return secondLargest;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        int res = secondLargest(arr);
        System.out.println(res);
    }
}
