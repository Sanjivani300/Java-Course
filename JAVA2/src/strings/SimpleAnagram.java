//  a a b --> a=2,b=1                                         a=   0|0|       b=  0|0|
//  a b a --> a=2,b=1                                              1|0|           1|0|       if no. are same then it is anagram
// 256 arrays are there where all no position are define           a|2|           a|2|
//                                                                 b|1|           b|2|

package strings;
public class SimpleAnagram {
    public static void main(String args[]){
//        String a = "aab";
//        String b = "aba";
//
//        boolean isAnagram = true;
//
//        int al[] = new int[256];
//        int bl[] = new int[256];
//
//        for(char c: a.toCharArray()){      //a vale string ko char mai thod daga or arrays mai dala daga or char by char for-each-loop sai acces kar rha hai
//            int index = (int) c;          //  (int) c   ko index mai type cast kiya hai                    //BOX MAI DALA HAI ABHI
//            al[index]++;                   // jo index aya hai uss ko index++ karge
//        }
//        for(char c: b.toCharArray()){     //CharArray=int=index converted    //SELF EXPLAINED:b string ie.String b = "aba"; sai ek char aya ga through toCharArray mai store hoga jis ka naam haam "char c" rakha ge sai (toCharArray coz of vo char hai or array sai aya hai so) then next line then char int mai convert hoga (int)c then (int)c store hoga int index mai or jo bhi index ke value hogi vo ++ hoga
//            int index = (int) c;          //int num=70;      char c='A';
//            bl[index]++;
//        }
//        for(int i=0;i<256;i++){      //convert int to char   EG. int num=70;
//            if(al[i] != bl[i]){                   //             char ch=(char)num;                 //THEN VO DONO KO COMPARE KAR GE
//                isAnagram = false;                //             SOPn(ch);
//                break;
//            }
//        }
//        if(isAnagram){
//            System.out.println("It is a anagram");
//        }else{
//            System.out.println("It is not a anagram");
//        }

        String a="aab";
        String b="aba";
        boolean isAnagram=true;
        int al[]=new int[256];
        int bl[]=new int[256];
        for(char c: a.toCharArray()){
            int index=(int) c;
            al[index]++;
        }
        for(char c: b.toCharArray()){
            int index=(int) c;
            bl[index]++;
        }
        for(int i=0;i<256;i++){
            if(al[i] != bl[i]){
                isAnagram=false;
                break;
            }
        }
        if(isAnagram){
            System.out.println("It is a anagram");
        }else{
            System.out.println("It is not a anagram");
        }





    }
}
