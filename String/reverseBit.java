package String;

public class reverseBit {
    public static int reverseBits(int n) {
        String str = String.valueOf(n);
        int j = str.length()-1;
        char arr[] = str.toCharArray();

        for(int i=0; i<arr.length/2; i++){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        String newstr = new String(arr);
        System.out.println(newstr);
        int ans = Integer.parseInt(newstr);
        return ans;
    }
    public static void main(String[] args) {
        int n = 1011011;
        int ans = reverseBits(n);
        System.out.println(ans);

    }
}
