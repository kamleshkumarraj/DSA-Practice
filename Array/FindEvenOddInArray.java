package Array;

import java.util.ArrayList;

public class FindEvenOddInArray {
    static ArrayList<Integer> findEven(int[] arr){
        ArrayList<Integer> even = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] %2==0) even.add(arr[i]);
        }
        return even;
    }
    static ArrayList<Integer> findOdd(int[] arr){
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] %2 != 0) odd.add(arr[i]);
        }
        return odd;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,23,56,78,79};
        System.out.println("Even array is : ");
        System.out.println(findEven(arr));
        System.out.println("Odd array is : ");
        System.out.println(findOdd(arr));
    }
}
