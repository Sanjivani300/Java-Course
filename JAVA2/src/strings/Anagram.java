//Anagram (1)cat=act  (2)race=care  (3)part=trap
// In one sentence v have se the next sentence is same with no. of letter and the letter r present or not

package strings;
public class Anagram {
    public static void main(String args[]) {
//        String a = "cat";                            //-------------------------------STEP 1-------------------------------//
//        String b = "act";
//
//        boolean isAnagram = false;
//        for(int i=0;i<a.length();i++){
//            char c = a.charAt(i);
//            isAnagram = false;    //aga ka code run nahi hoga
//            for(int j=0;j<b.length();j++){
//                if(b.charAt(j) == c){
//                    isAnagram =  true;       //true hai to aga ga code run hoga
//                    break;
//                }
//            }
//            if(! isAnagram){
//                break;                    //-------------if aab=abc it will show true coz a is consider 2 time and it is satisfy in 1 only so-----------------//
//            }
//        }
//        if(isAnagram){
//            System.out.println("It is a anagram");
//        }else{
//            System.out.println("It is not a anagram");
//        }


//        String a ="aat";                             //-------------------------------STEP 2-------------------------------//
//        String b ="act";
//        boolean isAnagram = false;
//
//        boolean visited[] = new boolean[b.length()];
//        if(a.length() == b.length()) {        // ager anagram false hai to ya block nahi chalaga
//            for (int i = 0; i < a.length(); i++) {
//                isAnagram = false;
//                int c = a.charAt(i);
//                for (int j = 0; j < b.length(); j++) {         //visited[j]= true nahi to false
//                    if (b.charAt(j) == c && !visited[j]) {      //equal hai or non-visited hai to ya block run hoga
//                        visited[j] = true;     //visited bhi true karna hai
//                        isAnagram = true;
//                        break;
//                    }
//                }
//                if (!isAnagram) {
//                    break;
//                }
//            }
//        }
//        if(isAnagram){
//            System.out.println("It is a anagram");
//        }else{
//            System.out.println("It is not a anagram");
//        }

    }
}
