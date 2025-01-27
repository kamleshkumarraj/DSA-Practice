package Array;

import java.util.Scanner;

public class ArrayMethod {

    //! Method for printing an array -->
    public static void printArray(int arr[]){
        System.out.print("[ ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }

    //! Method for taking input in array from an user -->
    public static void takeInput(int arr[] , int size){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of the array -->");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }
}
