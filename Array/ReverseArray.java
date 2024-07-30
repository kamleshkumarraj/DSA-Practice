package Array;

import java.util.Scanner;

public class ReverseArray {
    static void swap(int[] arr , int idx , int last_idx){
        int temp = arr[idx];
        arr[idx] = arr[last_idx];
        arr[last_idx] = temp;
    }
    static void reverseArray(int[] arr){
        int last_idx = arr.length-1;
        for(int i=0; i<arr.length/2; i++){
            swap(arr , i , last_idx);
            last_idx--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the array : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Print array as it is : ");
        PrintArray.printArray(arr);
        System.out.println("print array after reverse : ");
        reverseArray(arr);
        PrintArray.printArray(arr);
    }
}
