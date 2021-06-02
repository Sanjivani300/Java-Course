package java1;

public class TernaryOperator {
    public static void main(String args[]) {
        int a = 15;
        int b = 18;

  /*    if(a>b){
            c=a;
        }else{
            c=b;
        }
        System.out.println(c);      */

        int c = a > b ? a : b;
        System.out.println("max of both number " + c);
    }
}
