//  a a b b c
//  a b a c b
//        al    bl                                              al     ie.al
// a -->  2     2                                              2-2=0      0
// b -->  2     2     --->  instant of this we will do this    2-2=0      0   if all 0 is coming then anagram otherwise 1 is coming then it is not
// c -->  1     1                                              1-1=0      0
//                                                         if  3-1=2  .... then it is not a anagram
package strings;

public class Simple2Anagram {
    public static void main(String args[]){
//        String a="aab";
//        String b="aba";
//
//        int al[]=new int[256];
//
//        boolean isAnagram=true;
//
//        for(char c: a.toCharArray()){
//            int index=(int) c;
//            al[index]++;
//        }
//        for(char c: b.toCharArray()){
//            int index=(int) c;
//            al[index]--;
//        }
//        for(int i=0;i<256;i++){
//            if(al[i] != 0){
//                isAnagram=false;
//                break;
//            }
//        }
//        if(isAnagram){
//            System.out.println("It is a anagram");
//        }else{
//            System.out.println("It is not a anagram");
//        }

     String a="a2b";
     String b="ab2";
     int al[]=new int[256];
     boolean isAnagram=true;
     for(char c: a.toCharArray()){
         int index=(int) c;
         al[index]++;
     }
     for(char c: b.toCharArray()){
         int index=(int) c;
         al[index]--;
     }
     for(int i=0;i<256;i++){
         if(al[i] != 0){
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
