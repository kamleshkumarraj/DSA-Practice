package Array;

import java.util.Scanner;

public class CountAccerance {
    static int countAccerance(int[] arr , int num){
        int acc = 0;
        for(int i=0; i<arr.length ; i++){
            if(arr[i] == num) acc++;
        }
        return acc;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for finding accurance : ");
        int num = sc.nextInt();
        int arr[] = {12,23,12,56,12,67,12};
        int res = countAccerance(arr , num);
        System.out.println("Total accerance is  : "+res);
    }
}
