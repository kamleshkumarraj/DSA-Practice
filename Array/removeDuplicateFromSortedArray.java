package Array;

import java.util.ArrayList;

public class removeDuplicateFromSortedArray {
    public static void removeDuplicate(int arr[]){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0; i < arr.length; i++){
            if(arr[i] != 0){
                ans.add(arr[i]);
                for(int j=i+1;  j < arr.length && arr[i]==arr[j] ; j++){
                    arr[j] = 0;
                }
            }
           
        }
        
        System.out.println(ans);
        System.out.println(ans.size());
    }
    
    public static void main(String[] args) {
     int arr[] = {1,1,2};
     removeDuplicate(arr);
    }
}
