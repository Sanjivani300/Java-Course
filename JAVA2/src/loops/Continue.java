/* for( ; ; ; ){
      //code
   if(condition){
       continue;
   }
 }
 Continue skips the current executing loop and moves to the next loop
 continue=kise condition ke liya loop sai bhara bhi nahi niklna chata hai or kise condition ka liya loop bhi na chale so condition use karte hai
 */
package loops;

public class Continue {
    public static void main(String args[]){
        for(int i=1;i<=100;i++){
            if(i>=40 && i<=50){     //40 sai 50 tak print nahi karge
                continue;
            }
            System.out.println(i);
        }
    }
}
