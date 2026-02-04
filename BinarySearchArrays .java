import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchArrays {
    public static int searchBinary(int [] arr1,int target) {
        int low = 0;
        int high = arr1.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr1[mid] == target) {
                return mid;
            } else if (arr1[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the\t"+n+"\tarray elements");
        for(int i=0;i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("enter target value");
        int target = sc.nextInt();
        int idx = searchBinary(arr,target);
        System.out.println(idx);

    }
}
