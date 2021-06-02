package java1;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String args[]) {
/*      int a=12, b=18, c=10;
        int result;

        if(a>b){
            if(a>c){
                result=a;
            }else{
                result=c;
            }
        }else{
            if(b>c){
                result=b;
            }else{
                result=c;
            }
        }
        System.out.println("largest of the three no is "+result);  */

        /*...........in one line by ternary operator.............*/

/*      int a=12, b=1800, c=100;
        int result=0;

        result= a>b ? a>c ? a: c: b>c? b: c;
        System.out.println("largest of the three no is "+result);    */

/*      Scanner obj=new Scanner(System.in);
        int num;
        num=obj.nextInt();
        if(num>0 && num<10){
            System.out.println("num is between 0 and 10");
        }
        if(num>10){
            System.out.println("got here");
        }
        if(num<10){
            System.out.println("num is between 0 and 10");
        }
        if(num>90){
            System.out.println("You earned an A");
        }else if(num>80){
            System.out.println("You earned an B");
        }else if(num>70){
            System.out.println("You earned an C");
        }               */

    Scanner obj=new Scanner(System.in);
        int num;
        System.out.println("Enter number");
        num=obj.nextInt();
        if(num>=0){
            if(num>=10){
                if(num>=30){
                    if(num>=50){
                        if(num>=70){
                            if(num>=90){
                              System.out.println("greater then 90 or equal to 90");
                            }else
                        System.out.println("greater then 70 or equal to 70");
                        }else
                    System.out.println("greater then 50 or equal to 50");
                    }else
                System.out.println("greater then 30 or equal to 30");
                }else
            System.out.println("greater then 10 or equal to 10");
            }else
        System.out.println("greater then 0 or equal to 0");
        }else
    System.out.println("none of them");

    }
}
