
import java.util.Scanner;
public class Week5_task1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println ("Enter the marks: ");
        double marks = input.nextDouble();

        if(marks >= 80 && marks <= 100)
        {
            System.out.println("Disctinction");
        }
        else if (marks >= 60 && marks <= 79) {
            System.out.println("Honors");
        }
        else if (marks >= 50 && marks <= 59) {
            System.out.println("Merit");
        }
        else if (marks >= 40 && marks <= 49) {
            System.out.println("Pass");
        }
        else if (marks >= 0 && marks <= 39) {
            System.out.println("Fail");
        }
        else {
            System.out.println("Invalid value entered");
            input.close();
        }
    }
}
