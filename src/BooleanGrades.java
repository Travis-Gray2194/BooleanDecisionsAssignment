/**
 * Created by ${TravisGray} on 10/11/2017.
 */
//Modify the program so a student could get a 'D' if they score between 60 and 69.
// Also, modify the program to print a + or - after the letter grade based on the last digit of the score.
// If the last digit is between 0 and 2 then print a - after the grade. If the last digit is 7,8 or 9 then print a + after the grade.
// Otherwise don't print a + or - if the last digit is between 3 and 6.
// Change the output to print the student's grade.
import java.util.Scanner;
public class BooleanGrades {
    public static void main(String[] args) {
        System.out.print("Enter your test score: ");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        int lastDigit = score % 10;//Using modulo operator to find last digit and assign to integer
        char grade = 'F';//I'm not hopeful

        if (score > 89) //If score is greater then 89 print A
            grade = 'A';
        else if (score > 80) //If Score is greater the 80 print B
            grade = 'B';
        else if (score > 70 && score < 78) //if score is greater than 70 and less than 78 print C
            grade = 'C';
        if (score > 60 && score < 69) //If score is greater than 60 and less than 69 print D
            grade = 'D';
        else if (score < 59) //If socre is less than 59 Print F
            grade = 'F';

        //LasDigit assigned from modulo operator
        if (lastDigit <= 2) //If lastdigit from score is less than or equal to to print - next to score
            System.out.println("-" + grade);

        else if (lastDigit >= 3 && lastDigit <= 6) //If lastdigit from score is greater than 3 or less than or equal to 6 print score
            System.out.println(grade);

        else if (lastDigit >= 7 && lastDigit <= 9)//If lastdigit from score is greater than 7 or less than or equal to 9 print score
            System.out.println("+"+ grade);


    }

}

