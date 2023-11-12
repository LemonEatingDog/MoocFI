
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputs = 0;

        while (true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num > 0 || num < 0) {
                inputs ++;
                continue;
            }

            if (num == 0){
                System.out.println("Number of numbers: " + inputs);
                break;
            }
        }
    }
}
