/* for( ; ; ){
      //code...
   if(condition){
      break;
      }
    }            */

// Example 1
package loops;

import java.util.Scanner;

public class Break {
    public static void main(String args[]) {
//        for(int i=1;i<=100;i++){
//            if(i==35){        // i jab 35 hoga to loop ke bhar hojaga break ke vaja sai
//                break;
//            }
//        System.out.println(i);
//        }
//    }
//}


//Example 2
//package loops;
//import java.util.Scanner;
//
//public class Break {
//    public static void main(String args[]){
//        Scanner obj=new Scanner(System.in);
//        for( ; ; ){               // ( ; ; )= infinity loop chal ga if v does't write in that
//            int n=obj.nextInt();   // -ve number dala ga to loop ke bhar hoga break statment sai
//            if(n<0){              // 23 23 65 753 -34  ab loop ke bhar hoag coz -ve no hai so
//                break;
//            }
//        }


//                             OR

        Scanner obj = new Scanner(System.in);
        for (int i = 0; i >= 0; i++) {                            //OR      i!=0          //for (int i = 0; i != 0; i++)
            int n = obj.nextInt();
            if (n < 0) {
                break;
            }
        }
    }
}