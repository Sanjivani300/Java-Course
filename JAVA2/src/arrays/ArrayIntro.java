// Array= ek variable ka use kar ke multiple value store kar sakta ho
package arrays;

public class ArrayIntro {
    public static void main(String args[]){
//        int[] marks = new int[5];     //1 Eg

//        int marks[] = new int[5];     //2 Eg

//        int[] marks;                 //3 Eg
//        marks = new int[5];

// (1)    int rollNos[], classes;   //rollNos = array
                                  //classes = int

// (2)    int[] rollNos, classes;  // both array    OR
//        int rollNos[], classes[];

//        int marks[] = new int[5];     // 0 1 2 3 4 = 4 index is define
//        System.out.println(marks[1]);     //ANS:0   by default 0 hota hai
//        System.out.println(marks[2]);      //ANS:0
//        System.out.println(marks[5]);   //ERROR:out of bound, coz 5 index is not define


//.........................INSELATION.........................

// (1)    int[] age = {2,5,1,34,12};   //by default 0 nahi ya vali value store hogi ie. 2=0index, 5=1index, 1=2index, 34=3index, 12=4index
//        double[] marks = {1.0,3.14,2.9};
//        System.out.println(marks[1]);   //ANS: 1.0

//        int[] age = {2,5,1,34,12};     //..........UPDATE............//
//        double[] marks = {1.0,3.14,2.9};
//        marks[1] = 4.56;
//        System.out.println(marks[1]);  //ANS: 4.56


//.........................FOR LOOP IN ARRAY.........................
//        int[] age = {2,5,1,34,12};
//        System.out.println(age[0]);
//        System.out.println(age[1]);
//        System.out.println(age[2]);
//        System.out.println(age[3]);
//        System.out.println(age[4]);    //ANS: 2 5 1 34 12  it is reperating so v will use loop

                //.......OR.......

        int[] age= {2,5,1,34,12};
        for(int i=0;i<=age.length;i++){
            System.out.println(age[i]);      //ANS: 2 5 1 34 12
        }
    }
}

// compile time error = when we miss ; then intellij only tell
// run time error = all r right during code but when v will run then it through error, Exception through hota hai