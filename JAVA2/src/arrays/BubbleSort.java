//                             SORTING
//                  .........(i) BUBBLE SORT...........
//           ( right element left vale ko check kar raha hai if right is small then left then swap )
//      [ 7 5 4 2 0 ]
// (1)  5 7 4 2 0      ( element are swapping one by one )
//      5 4 7 2 0
//      5 4 2 7 0
//      5 4 2 0 7     // n element then sorted array in (n-1)
// (2)  4 2 0 5 7
// (3)  2 0 4 5 7
// (4)  0 2 4 5 7
package arrays;
public class BubbleSort {
    public static void main(String args[]) {
//        int a[] = {2, 1, 8, -3, 6, 4, 12};
//        int n = a.length;    //size is store in diff variable
//
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - 1; j++) {
//                if (a[j + 1] < a[j]) {     //right element chota hua left vala sai
//                    int temp = a[j + 1];   // then v will swap             // 2 element to swap karna hai  a=10
//                    a[j + 1] = a[j];                                                     //              b=5
//                    a[j] = temp;                                                         //      Wrong= b=a=10    Right= Temp=b=5
//                }                                                                        //             a=b=10           b=a=10
//            }                                                                            //                              a=temp=5
//        }        // For-Each loop              //         for(int i=0;i<n;i++){
//        for (int item : a) {                   // OR          int item=a[i];
//            System.out.print(item + " ");      //             System.out.print(item + " ");
//        }                                      //         }


        //...................TWO.......................
//        int a[] = {2, 1, 8, -3, 6, 4, 12};
//        int n = a.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - 1 - i; j++) {   //n-1-i coz last mai same hai to time kaam karne ka liya
//                if (a[j + 1] < a[j]) {              //sorted part hai vo vapas sai sort nahi hoga
//                    int temp = a[j + 1];
//                    a[j + 1] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        for (int item : a) {
//            System.out.print(item + " ");
//        }

        //...................THREE.......................
        int a[] = {2, 1, 8, -3, 6, 4, 12};
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean sorted = true ;    //Sort hogaya hai coz ek baar bhi swaap nahi hua hai
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j + 1] < a[j]) {                //Ager array n-1 phala sort hua to we will do this
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;

                    sorted = false;   //array sorted hona baki hai
                }
            }
            if(sorted) break;    //YES array sorted hai to break
        }
        for (int item : a) {
            System.out.print(item + " ");
        }
    }
}

// OUTPUT: -3 1 2 4 6 8 12        sorted form