package java1;

public class LogicalOperator {
    public static void main(String args[]){
   /*   int number=-40;

        if(number>=1 && number<=100){
            System.out.println("Number is in the range");
        }           */

   /*   int grade=12;
        if(grade==10 | grade==12){        (| logical or)
            System.out.println("You can give border exam now");
        }          */

        int grade=11;
        if(!(grade==10 || grade==12)){
            System.out.println("You can not give border exam now");
        }
    }
}
