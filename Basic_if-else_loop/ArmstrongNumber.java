public class ArmstrongNumber {
    //This method is only applicable for three digit numbers.
    static boolean isArmstrongNumber(int value){
        int sum = 0;
        for(int i = value ; i > 0 ; i = i/10){
            int unit_val = i%10;
            sum += unit_val*unit_val*unit_val;
        }
        if(sum == value) return true;
        else return false;
    }
    public static void main(String[] args) {
        if(isArmstrongNumber(407)) System.out.println("Given number is armstrong number ");
        else System.out.println("Given number is not armstrong number");
    }
}
