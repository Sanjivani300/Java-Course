/* for(statment 1 ;statment 2 ;statment 3){
      //code for loop 1
     for(statment 1 ;statment 2 ;statment 3){
         //code for looop 2
      }
   }
*/
package nestedForLoops;
/* public class NestedForLoop {                      //STEP 1
    public static void main(String args[]){
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
    }
}  */

public class NestedForLoop {                          //STEP 2
    public static void main(String args[]){
        for(int j=1;j<=5;j++){       //5 time run hoga 1 to 10   //vertical line |
            for(int i=1;i<=10;i++){         //horizontal line ---
                System.out.print(i+" ");
            }
            System.out.println( );
        }

    }
}