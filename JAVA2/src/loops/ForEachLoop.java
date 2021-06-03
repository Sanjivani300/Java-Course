//                                                                          FOR-EACH-LOOP
//   for( TYPE VAR_NAME : ArrayList/Array){
//       .....
//   }
package loops;
import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String args[]){

        ArrayList<String> itemsArrayList = new ArrayList<>();          // ArrayList                          EXAMPLE.1
        itemsArrayList.add("item1");
        itemsArrayList.add("item2");
        itemsArrayList.add("item3");
//        for(String item : itemsArrayList)          // ArrayList by for-each-loop
//            System.out.print(item + " ");          //OUTPUT: item1 item2 item3


//        String[] itemsArray = {"item1","item2","item3"};         //Array                                     EXAMPLE.2
//        for(String item : itemsArray)              //Array by for-each-loop
//            System.out.print(item + " ");          //OUTPUT: item1 item2 item3


//        int a[]={10,20,30,40,50};                  //                                                          EXAMPLE.3
//        for(int b : a){
//            System.out.print(b + " ");
//        }
    }
}