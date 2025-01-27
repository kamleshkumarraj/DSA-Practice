package Array;

import java.util.Scanner;

public class findMaxInArray {
    public static int findMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int findSecondMax(int arr[]) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                firstMax = arr[i];

            }
            if (arr[i] > secondMax && arr[i] != firstMax)
                secondMax = arr[i];
        }
        return secondMax;
    }

    // ! find second max in an array using brootforst approach -->
    // public static int findSecondMax(int arr[]){
    // int max = Integer.MIN_VALUE;
    // for(int i=0; i<arr.length; i++){
    // if(arr[i] > max) {
    // max = arr[i];
    // }
    // }
    // for(int i=0; i<arr.length; i++) if(arr[i] == max) arr[i]=Integer.MIN_VALUE;
    // int secondMax = findMax(arr);
    // return secondMax;
    // }

    public static void main(String[] args) {
        System.out.println("Enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        ArrayMethod.takeInput(arr, n);
        System.out.println("The maximum element in the array is : " + findMax(arr));
        System.out.println("Second maximum element in the array is : " + findSecondMax(arr));
    }
}
