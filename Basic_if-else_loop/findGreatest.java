//find greatest in three number 
public class findGreatest {
     static int findGreatest_Ternanry(int a , int b , int c){
        return a>b && a>c ? a : b>c ? b :c;
    }

     static int findGreatest_IfElse(int a , int b, int c){
        if(a > b && a >c) return a;
        else if(b > c) return b;
        else return c;

     }
    public static void main(String[] args) {
       int res =  findGreatest_Ternanry(100,710,4556);
    //    int res = findGreatest_IfElse(1209,340,45);
       System.out.println("Greatst number = "+res);
    }
}
