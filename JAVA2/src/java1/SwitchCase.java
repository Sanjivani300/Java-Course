package java1;

public class SwitchCase {
    public static void main(String args[]){
/*      Scanner obj=new Scanner(System.in);
        System.out.print("Enter your roll number");
        int roll;
        roll=obj.nextInt();
        switch(roll){
            case 101:
                System.out.println("Student name= Ramesh");
                break;
            case 102:
                System.out.println("Student name= Mukesh");
                break;
            case 103:
                System.out.println("Student name= Shyam");
                break;
            default:
                System.out.println("Unknown student ");
        }        */




/*      int dayOfWeek=4;
        if(dayOfWeek==1) {
            System.out.print("1");
        }
        if(dayOfWeek==2){
            System.out.print("2");
        }
        if(dayOfWeek==3){
            System.out.print("3");
        }
        if(dayOfWeek==4){
            System.out.print("4");
        }
        if(dayOfWeek==5){
            System.out.print("5");
        }
        if(dayOfWeek==6){
            System.out.print("6");
        }    */                           /* if condition will not be fit so switch we will use */


/*      int dayOfWeek=2;
        switch(dayOfWeek){
            case 1:
                System.out.print("I'm on leave ");
                break;
            case 2:
                System.out.print("I'm in office ");
                break;
            case 3:
                System.out.print("I'm playing football");
                break;
            default:
                System.out.print("I don't know what day it is");
        }   */
        /*......... OR (case 1 and 2 same) ......*/

/*      int dayOfWeek=2;
        switch(dayOfWeek){
            case 1:
            case 2:
                System.out.print("I'm in office ");
                break;
            case 3:
                System.out.print("I'm playing football");
                break;
            default:
                System.out.print("I don't know what day it is");
        }    */

        int rating=4;
        switch(rating){
            case 1:
            case 2:
                System.out.println("Bad review");
                break;
            case 3:
                System.out.println("average review");
                break;
            case 4:
            case 5:
                System.out.println("good review");
                break;
        }

    }
}
