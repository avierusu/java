package chapter5.examples;

import java.util.Scanner;

public class LetterGrades {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int total = 0;          // total of grades
        int gradeCounter = 0;   // # of grades
        // # of each letter grade
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        System.out.print("Enter the integer grades in the range 0-100.\n"
                        + "Type <CTRL> + Z, then Enter to exit\n\n");
        
        while (input.hasNext()){
            int grade = input.nextInt();
            total += grade;
            gradeCounter++;
            int oneTenth = grade / 10;

            switch (oneTenth){
                case 9:
                case 10:
                    aCount++;
                    break;
                
                case 8:
                    bCount++;
                    break;
                
                case 7:
                    cCount++;
                    break;
                
                case 6:
                    dCount++;
                    break;
                
                default:
                    fCount++;
            }
        }

        // Displays the grade report
        System.out.print("\nGrade Report:\n");

        if (gradeCounter != 0){
            double average = (double) total / gradeCounter;     // Calc average of all grades

            // Summary of results
            System.out.printf("Total of %d grades entered is %d\n", gradeCounter, total);
            System.out.printf("Class average is %.2f\n", average);
            System.out.printf("\n%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
                            "Number of students who received each grade:",
                                    "A: ", aCount,
                                    "B: ", bCount,
                                    "C: ", cCount,
                                    "D: ", dCount,
                                    "F: ", fCount);
        } else {
            System.out.println("No grades were entered.");
        }

        input.close();
    }
}
