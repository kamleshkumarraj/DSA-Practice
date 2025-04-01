import java.util.ArrayList;
import java.util.List;

public class beautifulSebset {
    //first we find all subset.
    public static void findAllSubset(List<List<Integer>> ans, List<Integer> miniAns, int nums[], int idx,int flag[]){
        if(idx == nums.length){
            ans.add(new ArrayList<>(miniAns));
            return;
        }
        for(int i=idx; i<nums.length; i++){
            if(flag[i] == 0){
                flag[i] = 1;
                miniAns.add(nums[i]);
                findAllSubset(ans, miniAns, nums, idx+1,flag);
                miniAns.remove(miniAns.size()-1);
                findAllSubset(ans, miniAns, nums, idx+1,flag);
                flag[i] = 0;
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> miniAns = new ArrayList<>();
        int flag[] = new int[arr.length];
        findAllSubset(ans, miniAns, arr,0,flag);
        System.out.println(ans);
    }
}
