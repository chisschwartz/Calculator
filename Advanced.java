import java.util.Scanner;
import java.util.ArrayList;

public class Advanced {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Pick a function: 1. Square 2. Squareroot 3. Cubed");
        int choice = myObj.nextInt();

            if (choice == 1) {
                System.out.println("Enter number to be squared");
                int value = myObj.nextInt();
                System.out.println(value * value);
        }

            if (choice == 2) {
                System.out.println("Enter number to be squarerooted");
                int value = myObj.nextInt();
                System.out.println(Math.sqrt(value));
        }

            if (choice == 3) {
                System.out.println("Enter number to be cubed");
                int value = myObj.nextInt();
                System.out.println(value * value * value);
        }
    }
}
