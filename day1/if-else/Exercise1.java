import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number of choice: ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("even");
        }  else {
            System.out.println("odd");
        }

        scanner.close();
    }
}