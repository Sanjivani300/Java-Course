// PRIME NUMBER OR NOT (1 or khud ke table mai ata ho)(1,3,5,7,9....)
//Q. write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.
package loops;
import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
//        Scanner obj = new Scanner(System.in);
//        int n = obj.nextInt();
//        boolean isPrime=true;    //for loop ager fale hoga then break sai bhara hoga, and then direcly number ider aya ga or true hoga
//        for(int i=2;i<n;i++) {
//            if (n % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        if(n<2){        //ager number less than 2 hoga then false hoga
//            isPrime=false;
//        }
//        System.out.println("isPrime "+isPrime);  //1,31,32



                  /*..............OR................*/

//        Scanner obj = new Scanner(System.in);         // idher we have run 2 to n loop chalya hai,per haam idher loop kaam chala sakta hai   √
//        int n = obj.nextInt();                        //so loop lo underoot of n bhi chala sakta hai
//        boolean isPrime=true;
//        for(int i=2;i*i<=n;i++) {       //i² < n  so there v have written i*i<n = i²<n
//            if (n % i == 0) {           //i < √n
//                isPrime = false;        //so abhi 2 sai n tak nahi abhi 2 sai √n tak chalga
//                break;
//            }
//        }
//        if(n<2){
//            isPrime=false;
//        }
//        System.out.println("isPrime "+isPrime);         //7=True ..so abhi loop "n" time nahi √n tak run hua coz of this time kaam hoga(time complasity hoga kitna kaam time mai Q solve kar sakte hai)


                             /*..............OR.......(my way).........*/

        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if(n>2){
            if (n % 2 == 0) {
                System.out.print("it is not a prime no");
            } else {
                System.out.print("it is a prime no");
            }
        }else{
            if(n<=2){
                System.out.print("it is a not a prime no");
            }
        }
    }
}















