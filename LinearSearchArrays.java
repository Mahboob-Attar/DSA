import java.util.Scanner;

public class LinearSearchArrays {
    public static int searchLinear(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array "+n+" elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter searching value:");
        int key = sc.nextInt();
        int res = searchLinear(arr,key);
        System.out.println(res);
    }
}
