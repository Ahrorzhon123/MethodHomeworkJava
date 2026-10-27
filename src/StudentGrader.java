import java.util.Scanner;

public class StudentGrader {

    public static void calculateGrade(int score){
        if (score >= 90){
            System.out.println("Your grade is A");
        } else if (score >= 80) {
            System.out.println("Your grade is B");
        } else if (score >= 70) {
            System.out.println("Your grade is C");
        } else if (score >= 60) {
            System.out.println("Your grade is D");
        } else {
            System.out.println("Your grade is F");
        }

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score 1 to 100:");
        int gradeScore = scanner.nextInt();


        if (gradeScore < 1 || gradeScore > 100){
            System.out.println("Please enter numbers from 1 to 100");
        } else {

            calculateGrade(gradeScore);
        }

        scanner.close();
    }
}