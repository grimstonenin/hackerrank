import java.util.Scanner;

/**
 HackerLand University has the following grading policy:

 Every student receives a grade in the inclusive range from 0 to 100.
 Any grade less than 40 is a failing grade.
 Sam is a professor at the university and likes to round each student's grade according to these rules:

 If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
 If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
 For example, grade=84 will be rounded to 85 but grade = 29 will not be rounded because the rounding would result in a number that is less than 40.

 Given the initial value of grade for each of Sam's n students, write code to automate the rounding process.

 For each grade, round it according to the rules above and print the result on a new line.
 */
public class GradingStudents {

    static int[] solve(int[] grades){

        int[] modifiedGrades = new int[grades.length];

        for(int index = 0; index < grades.length; index++){
            if(grades[index] < 38 ){
                modifiedGrades[index] = grades[index];
            } else if(((grades[index] % 10) % 5) >= 3){
                modifiedGrades[index] = grades[index] + (5-((grades[index] % 10) % 5));
            }
            else {
                modifiedGrades[index] = grades[index];
            }

        }
        return modifiedGrades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}
