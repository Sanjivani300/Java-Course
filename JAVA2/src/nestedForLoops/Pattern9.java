//      *                   ...1st part (i no of time * print)                      *
//      *  *               |                                                        *  *
//      *     *            |...2nd part (2 * print)                    ==>          *  -  *          ...1 space print
//      *        *         |                                                        *  -  -  *       ...2 space print
//      *  *  *  *  *       ...3rd part (n no of time * print)                      *  *  *  *  *     So, (i-2) Spaces

package nestedForLoops;
import java.util.Scanner;
public class Pattern9 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println("*");            // 1st part

        for(int i=2;i<=n-1;i++){            // 2nd part    //vertical line |   //middle part so 2 sai start and end hora hai 1 ke bad so n-1
            System.out.print("* ");         // * (1)
               for(int j=1;j<=i-2;j++){
                  System.out.print("  ");   //i-2=space print  //horizontal line ---// System.out.print("  ");  // space (2)
               }
            System.out.print("*");          // * (3)
            System.out.println();           // nextline (4)
        }

        if(n>1) {       //3rd part        //n=1 hoge then it will not work
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
        }
    }
}
