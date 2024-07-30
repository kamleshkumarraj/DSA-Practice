package Array;

import java.util.ArrayList;

public class FindDuplicate {
    static ArrayList<Integer> getDuplicateValue(int[] arr){
        //Create temporary array for storing duplicates value
        ArrayList<Integer> tempArr = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] != Integer.MIN_VALUE){
                //initialize falg for checking that valuue is duplicate or not.
                int count =0 ;
                for(int j=i+1; j<arr.length; j++){
                    if(arr[i] == arr[j]){
                        count = 1;
                        //if value is duplicate then we initialize by a unique value sothat next time we can't check those are checking already.
                        arr[j] = Integer.MIN_VALUE;
                    }
                }
                if(count ==1) tempArr.add(arr[i]);
            }
            
        }
        return tempArr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,2,4,6,7,2,4,6};
        ArrayList<Integer> ans = new ArrayList<>();
        ans = getDuplicateValue(arr);
        System.out.println(ans);
    }
}
