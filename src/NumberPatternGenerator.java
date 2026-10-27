import java.util.Scanner;

public class NumberPatternGenerator {

    public static void rightTriangle(int size){
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void invertedTriangle(int size){
        for(int i = size; i>=1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pyramid(int size){
        for(int i = 1; i <= size; i++){
            for(int j = 1; j<= size - 1; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedPyramid(int size){
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * (size - i) + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void numberPattern(int size) {
        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the pattern: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Size must be greater than 0.");
            scanner.close();
            return;
        }

        System.out.println();
        System.out.println("Choose the pattern type:");
        System.out.println("1 - Right Triangle");
        System.out.println("2 - Inverted Right Triangle");
        System.out.println("3 - Pyramid");
        System.out.println("4 - Inverted Pyramid");
        System.out.println("5 - Number Pattern");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.println();

        switch (choice) {
            case 1:
                rightTriangle(size);
                break;

            case 2:
                invertedTriangle(size);
                break;

            case 3:
                pyramid(size);
                break;

            case 4:
                invertedPyramid(size);
                break;

            case 5:
                numberPattern(size);
                break;

            default:
                System.out.println("Invalid choice. Please select a number from 1 to 5.");
        }
    }
}
