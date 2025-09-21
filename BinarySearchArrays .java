import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchArrays {
    public static int searchBinary(int [] arr,int target) {
        int low = 0;
        int high = arr.length - 1;
        boolean isAssending = arr[0] <= arr[arr.length-1];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }if(isAssending){
                if (arr[mid] < target) {
                    low = mid + 1;
                }else {
                    high = mid - 1;
                }
            }else{
                    if(arr[mid]>target){
                        low = mid+1;
                    }else{
                        high= mid-1;
                    }
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
       // Arrays.sort(arr); this only sort asc if u want desc must use INTEGER[] with collection.reverse()
        System.out.println("enter target value");
        int target = sc.nextInt();
        int idx = searchBinary(arr,target);
        System.out.println(idx);

    }
}
