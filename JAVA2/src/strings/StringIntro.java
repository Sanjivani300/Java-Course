//                              STRING                                                IMP
// string = "Anju"     "my name is"   "A"                   |                                                         string pool area         heap area
// character = 'A'    'AB'(Wrong)                           | String animal1 = new String("Dog");                        "Dog"(1)               "Dog"(1)
//                                                          | String animal2 = "Cat";                                   "Cat"(2)(3)
//                                                          | String animal3 = "Cat";
//                                                                //(aminal1) will go in both string pool and heap coz of NEW, but animal(2)(3) they are same and new is not there so only one will be in string pool
//                                                                //

//string are IMMUTABLE (if once's it is define then it will not change if v have to add in that only then it will not be same but new string it will make)
package strings;

import static java.lang.System.*;

    public class StringIntro {
        public static void main(String args[]) {
//        String name = "Anuj";           // EG.1
//        System.out.println(name);

//        String name = "Anuj";             //EG.2
//        String anotherName = new String("Aman");
//        System.out.println(anotherName);              //Output: Aman


//        String name = "Anuj";              //EG.3
//        String anotherName = new String("Anuj");
//        System.out.println(name == anotherName);   //They r eqaul   //Output:FALSE  //Coz name="Anuj" HEAP val hai or new String="Anuj" STRING POOL vala hai so they r not equal


//        String name = "Anuj";               //EG.4
//        String name2 = "Anuj";
//        String anotherName = new String("Anuj");
//        System.out.println(name == name2);   //Output: TRUE  //coz both r store in STRING POOL AREA so


//        String name = "Anuj";                //EG.5
//        name = "Kumar";         //Anuj memory mai padha rahe ga Kumar naam ka diff string ban jage or uss ke value name mai assign hojage
//        System.out.println(name);    //OUTPUT: Kumar


            //----------------------------------------xxx--------------------------------------

            //Functions in String
//        1.char charAt(int index)
//        2.int length()
//        3.String substring(int beginIndex)
//        4.String substring(int beginIndex, int endIndex)
//        5.boolean contains(CharSequence s)
//        6.boolean equals(Object another)
//        7.boolean isEmpty()
//        8.String concat(String str)
//        9.String replace(char old, char new)
//       10.String[] split(String regex)
//       11.int indexOf(int ch)
//       12.String toLowerCase()
//       13.String toUpperCase()
//       14.String trim()



//    1.char charAt(int index)    ------------>>>
//        Eg.
//        String name = "Anuj";
//        System.out.println(name.charAt(3));       //OUTPUT: j  (1)eg
//        System.out.println(name.charAt(2));         //OUTPUT: u  (2)eg


//    2.int length()     ------------>>>
//        Eg.
//        String name = "Anuj";                //OUTPUT:4 (character)   //(1)eg
//        String name = "Anuj kumar sharma";     //OUTPUT: 17     //(2)eg
//        System.out.println(name.length());     //OUTPUT: 4


//    3.String substring(int beginIndex)     ------------>>>
//        Eg.
//        String name = "Anuj kumar Sharma";
//        System.out.println(name.substring(5));    //OUTPUT:kumar Sharma     5th sai sab print hoga


//    4.String substring(int beginIndex, int endIndex)     ------------>>>
//        Eg.
//        String name = "Anuj kumar Sharma";
//        System.out.println(name.substring(5,12));    //OUTPUT:kumar S    //(1)eg     5th sai (12th-1st position) tak chalga ga
//        System.out.println(name.substring(5,6));     //OUTPUT:k     //(2)eg      5th sAai (6th-1st) position
//        System.out.println(name.substring(0,17));    //OUTPUT:Anuj kumar Sharma     //(3)eg


//    5.boolean contains(CharSequence s)     ------------>>>
//        Eg.
//        String name = "Anuj kumar Sharma";
//        System.out.println(name.contains("Anuj"));     //OUTPUT:True   //(1)eg   coz Anuj is present
//        System.out.println(name.contains("Aman"));      //OUTPUT:False   //(2)eg


//    6.boolean equals(Object another)     ------------>>>
//        Eg.
//        String name = "Anuj";        //Eg.1 from EG.3
//        String name2 = new String("Anuj");
//        System.out.println(name = name2);       //OUTPUT:Anuj

//        String name = "Anuj";          //Eg.2
//        String name2 = new String("Anuj");
//        System.out.println(name.equals(name2));       //OUTPUT:True  //ya app ke value check kar raha hai obj reference ko nahi

//        String name = "Anuj";         //Eg.3
//        String name2 = new String("Anuj ");
//        System.out.println(name.equals(name2));       //OUTPUT:False  //space so


//    7.boolean isEmpty()     ------------>>>
//        Eg.
//        String name = "";                       //Eg.1
//        System.out.println(name.isEmpty());      //OUTPUT:True  it is empty

//        String name2 = new String("Anuj ");         //Eg.2
//        System.out.println(name2.isEmpty());       //OUTPUT:False   coz it is not empty


//    8.String concat(String str)     ------------>>>
//        Eg.
//        String name = "Anuj";         //Eg.1(i)
//        name = name + " Kumar";
//        System.out.println(name);      //OUTPUT:Anuj Kumar    But if v dont want to like this so

//        String name = "Anuj";         //Eg.1(ii)
//        name = name + " Kumar";
//        System.out.println(name.concat(" Sharma"));       //OUTPUT:Anuj Kumar Sharma


//    9.String replace(char old, char new)     ------------>>>
//        Eg.
//        String name = "Anuj KumAr";
//        System.out.println(name.replace('A','C'));    //OUTPUT:Cnuj KumCr        "A" is replace by "c"



//    10.String[] split(String regex)     ------------>>>
//        Eg.
//        String cars = "Hyundai,Maruti,Swift,Wagonr,Ferrari,Lamborghini";         //Eg.1
//        String allCars[] = cars.split(",");
//        for(String car: allCars){
//             System.out.println(car);
//        }
//  OUTPUT:
//        Hyundai
//        Maruti
//        Swift
//        Wagonr
//        Ferrari
//        Lamborghini

///        String cars = "Hyundai,Maruti,Swift,Wagonr,Ferrari,Lamborghini";         //Eg.2
//         String allCars[] = cars.split("a");
//         for(String car: allCars){
//              System.out.println(car);          //"a" sai split hue
//         }
// OUTPUT:
//        Hyund
//        i,M
//        ruti,Swift,W
//        gonr,Ferr
//        ri,L
//        mborghini

///        String cars = "Hyundai,Maruti,Swift,Wagonr,Ferrari,Lamborghini";         //Eg.3
//         String allCars[] = cars.split("ar");
//         for(String car: allCars){
//              System.out.println(car);          //"ar" sai split hue
//         }
// OUTPUT:
//        Hyundai,M
//        uti,Swift,Wagonr,Ferr
//        i,Lamborghini



//    11.int indexOf(int ch)     ------------>>>
//        Eg.
//        String cars = "Hyundai,Maruti";              //Eg.1
//        System.out.println(cars.indexOf('M'));       //OUTPUT:8         at 8th position 'M' is there

//        String cars = "Hyundai,Maruti";              //Eg.2
//        System.out.println(cars.indexOf('Z'));       //OUTPUT: -1      coz 'Z' is not present so -1



//    12.String toLowerCase()     ------------>>>
//        Eg.
//        String name = "SANJIVANni";                 //Eg.1
//        System.out.println(name.toLowerCase());     //OUTPUT: sanjivanni

//        String cars = "Hyundai,Maruti";             //Eg.2
//        System.out.println(cars.toLowerCase());     //OUTPUT: hyundai,maruti



//    13.String toUpperCase()     ------------>>>
//        Eg.
//        String name = "sanjivani";                  //Eg.1
//        System.out.println(name.toUpperCase());     //OUTPUT: SANJIVANI

//        String cars = "Hyundai,Maruti";             //Eg.2
//        System.out.println(cars.toUpperCase());     //OUTPUT: HYUNDAI,MARUTI



//    14.String trim()     ------------>>>
//        Eg.
//        String name = "      Sanju      ";          // Normal One
//        System.out.println(name);                   //OUTPUT:      Sanju       //space are also print

//        String name = "      Sanju      ";          //Eg.1
//        System.out.println(name.trim());            //OUTPUT:Sanju     //no space

        }
    }