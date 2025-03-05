package Recursion.src;

import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Scanner;

public class recursion {
    // recursion for finding the factorial of the number.
    public static int findFact(int n){
        if(n==0 || n==1) return 1;
        return n* findFact(n-1);
    }

    //recursion for finding the sum from 1 to n.
    public static int findSum(int n){
        if(n==1) return n;
        return n+findSum(n-1);
    }

    // recursion for find the sum of the given digit.
    public static int findSumOfDigit(int n){
        if(n<10) return n;
        return n%10+findSumOfDigit(n/10);
    }

    // recursion for checking number is armstrong or not.
    public static boolean checkArmstrong(int n, int temp, double sum){
        if(n==0){
            return sum == (double) temp;
        }
        return checkArmstrong(n/10, temp, sum+Math.pow(n%10,3));
    }

    // recursion for finding the power for a^b.
    public static int power(int a, int b){
        if(b==1) return a;
        return a * power(a,b-1);
    }

    // recursion for checking given number is prime or not.
    public static boolean checkPrime(int n, int target, int sum){
        if(target == 0) return sum == 2;
        return checkPrime(n,target-1, n % target == 0 ? ++sum : sum);
    }

    // recursion for printing the n fibonaci series.
    public static void printFibonacci(int n, int a, int b){
        if(n==2) {
            return;
        }
        System.out.print(a+b+" ");
        printFibonacci(n-1, b ,a+b);
    }

    // recursion for nth term for fibonaci.
    public static int findnthFibonaci(int n){
        if(n==1 || n==2) return n-1;
        return findnthFibonaci(n-1) + findnthFibonaci(n-2);
    }

    // recursion for find the lcm.
    public static int findLCM(int a, int b, int c, int rem, int lcm){
        if(rem == 0) return lcm-1;
        return findLCM(a,b,c, lcm%a == 0 && lcm%b == 0 && lcm%c == 0 ? 0 : 1, lcm+1);
    }

    // recursion for find the hcf.
    public static int findHCF(int a, int b, int hcf){
        if(hcf==1) return 1;
        if(a%hcf==0 && b%hcf==0) return hcf;
        return findHCF(a,b,hcf-1);
    }

    // recursion for any base to decimal.
    public static double dec(int num, int base, int position){
        if(num == 0) return 0;
        return ((Math.pow(base , position)) * (num %10)) + dec(num/10,base, ++position);
    }

    public static int findDigitInNumber(int num){
        if(num <= 0) return 0;
        return 1+findDigitInNumber(num/10);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value for checking armstrong : ");
//        int n = sc.nextInt();
//        int fact = findFact(n);
//        System.out.println("Factorial of "+n+" = "+fact);

//        int sum = findSum(n);
//        System.out.println("Sum of "+n+" = "+sum);

//        int sum = findSumOfDigit(n);
//        System.out.println("Sum of "+n+" = "+sum);

//        boolean res = checkArmstrong(n,n, 0.0);
//        if(res) System.out.println("Given number is armstrong !");
//        else System.out.println("Given number is not armstrong !");


//        System.out.println("Enter the value of a : ");
//        int a = sc.nextInt();
//        System.out.println("Enter the value of b : ");
//        int b = sc.nextInt();
//        int pow = power(a,b);
//        System.out.println(a+" ^ "+b+" = "+pow);

//        System.out.println("Enter value for checking the prime or not = ");
//        int n = sc.nextInt();
//        boolean res = checkPrime(n,n,0);
//        if(res) System.out.println("Given number is prime number ");
//        else System.out.println("Given number is not a prime number !");

//        System.out.print("Enter n for printing fibonacci : ");
//        int n = sc.nextInt();
//        System.out.print("0 1 ");
//        printFibonacci(n,0,1);
//
//        System.out.print("Enter the value of n : ");
//        int n = sc.nextInt();
//        int ans = findnthFibonaci(n);
//        System.out.println(n+"th term of fibonaci "+ans);
//        System.out.println("Enter a = ");
//        int a = sc.nextInt();
//        System.out.println("Enter b = ");
//        int b = sc.nextInt();
//        System.out.println("Enter c = ");
//        int c = sc.nextInt();
//
//        int ans = findLCM(a,b,c,1,a);
//        System.out.println("LCM of "+a+" "+b+" "+c+" "+" = "+ans);

//        System.out.println("Enter a = ");
//        int a = sc.nextInt();
//        System.out.println("Enter b = ");
//        int b = sc.nextInt();
//
//        int ans = findHCF(a,b,a);
//        System.out.println("HCF of "+a+" "+b+" "+" "+" = "+ans);

//        System.out.print("Enter the base of the number : ");
//        int base = sc.nextInt();
//
//        System.out.print("Enter the only "+base + " base value : ");
//        int val = sc.nextInt();
//
//        double res = dec(val,base,0);
//        System.out.println(val+" of base 10 = "+res);

        System.out.println("Enter the digit : ");
        int n = sc.nextInt();
        int res = findDigitInNumber(n);
        System.out.println("Number of digit = "+res);
    }
}


class ArrayWithRecursion{

    // print array funcnility for array.
    public static void printArr(int arr[], int n){
        if(n<=0) return;
        printArr(arr,--n);
        System.out.print(arr[n]+" ");
    }

    // code for linear search in array.
    public static boolean linearSearch(int arr[], int n, int target){
        if(n<0) return false;
        if(arr[n] == target) return true;
        return  linearSearch(arr,n-1,target);
    }

    //code for binary search in array.
    public static boolean binarySearch(int arr[], int stIdx, int endIdx, int target){
        if(stIdx > endIdx) return false;
        int middle = (stIdx+endIdx)/2;
        if(arr[middle] == target) return true;
        if(target < arr[middle]) return binarySearch(arr,stIdx,middle-1,target);
        else return binarySearch(arr,middle+1, arr.length-1,target);

    }

    // code for find the sum of the array
    public static int sumOfArray(int arr[], int len){
        if(len == 0) return arr[0];
        return arr[len] + sumOfArray(arr,len-1);
    }

    // code for creating the prefix sum of an array.
    public static int prefixSum(int arr[], int len,int ans[]){
        if(len == 0) {
            ans[len] = arr[0];
            return arr[0];
        };
        return ans[len] = prefixSum(arr,len-1,ans)+arr[len];

    }

    // code for suffix sum of an array.
    public static int suffixSum(int arr[], int len, int ans[]){
        if(len == arr.length-1) return ans[len] = arr[len];
        return ans[len] = arr[len]+suffixSum(arr, len+1,ans);
    }

    // code for find maximum element from an array;
    public static int findMax(int arr[], int max, int len){
        if(len == 0){
            if(max < arr[0]) max = arr[0];
            return max;
        };
        if(arr[len] > max) max=arr[len];
        return findMax(arr,max, len-1);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[5];
        System.out.println("Enter array element : ");
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//        printArr(arr, arr.length);


//        System.out.println("Enter the value for search : ");
//        int target = sc.nextInt();
//        System.out.println(linearSearch(arr,arr.length-1,target));
//        System.out.println("Enter the value for search : ");
//        int target = sc.nextInt();
//        System.out.println(binarySearch(arr,0,arr.length-1,target));
//        int ans[] = new int[arr.length];
//        prefixSum(arr,arr.length-1,ans);
//        printArr(ans,arr.length);

//        int ans[] = new int[arr.length];
//        suffixSum(arr,0,ans);
//        printArr(ans,arr.length);

        int ans = findMax(arr,Integer.MIN_VALUE, arr.length-1);
        System.out.println("Maximum number is : "+ans);

    }
}
