package Array;

public class deleteElement {

    public static void deleteElem(int arr[], int target){
        int size = arr.length;
        for(int i=0; i<size; i++){
            if(target == arr[i]){
                System.out.println(size);
                --size;
                for(int j=i; j<size; j++){
                    arr[j] = arr[j+1];
                }
                arr[size] = 0;
                if(target == arr[i]) --i;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,2,3,0,4,2};

        for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
        System.out.println();
        deleteElem(arr,2);
        for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
    }
}












