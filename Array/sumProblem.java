package Array;

import java.util.ArrayList;

public class sumProblem {
    public static ArrayList<Integer> twoSumProblem(int[] arr, int target){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == target){
                    ans.add(i);
                    ans.add(j);
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        ArrayList<Integer> ans = twoSumProblem(arr,9);
        System.out.println(ans);
    }
}
