package Array;

public class PrintArray {
    static void printArray(int[] arr){
        System.out.print("[ " );
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }
}
