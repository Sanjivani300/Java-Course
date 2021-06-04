/* OUTPUT:
        Enter the number of student:
        5
        Enter the marks
        56
        31
        34
        55
        66
        the average marks are 48    */
package arrays;
import java.util.Scanner;

public class AverageMarksOfStudents {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of student: ");
        int n=obj.nextInt();     // n = 5student   assume

        System.out.println("Enter the marks now ");

        int marks[]=new int[n];   //5 empty box with n size
        //5 empty box have 0 value

        for(int i=0;i<n;i++){      //"n" or "marks.length"
            marks[i] = obj.nextInt();  //5 empty box fill with user number in "i" position
        }

        int averageMarks = 0;   //ab 5 marks aya hai so pure 5 marks ko + karna hai  //average define karge for loop sai

        for(int j=0;j<n;j++) {  //average= sum/number of items =ie. sum/n
            averageMarks = averageMarks + marks[j];
        }

        averageMarks= averageMarks / n;
        System.out.println("the average marks are "+averageMarks);
    }
}