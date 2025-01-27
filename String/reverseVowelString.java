package String;

class Solution {
    public void swap(String s , int i , int j){
        char temp = s[i];
        s[j] = s[i];
        s[i] = temp;
    }
    public String reverseVowels(String p) {
        char s[] = new char[p.length()];
        s = p.toCharArray();
        int j = s.length-1;
        for(int i=0; i<s.length/2; ){
            if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' || s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U'){
                if(s[j] == 'a' || s[j] == 'e' || s[j] == 'j' || s[j] == 'o' || s[j] == 'u' || s[j] == 'A' || s[j] == 'E' || s[j] == 'I' || s[j] == 'O' || s[j] == 'U'){
                    this.swap(s,i,j);
                    i++;
                    j--;
                }else{
                    j--;
                }
            }else{i++;}
        }
        String str = new String(s);
        return str;
    }
}
public class reverseVowelString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "hello";
        System.out.println(solution.reverseVowels(s));
    }
}
