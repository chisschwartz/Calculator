import java.util.Scanner;
import java.util.ArrayList;



public class Calculator {

    static Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) {
//            Scanner myObj = new Scanner(System.in);

            System.out.println("What functions would you like: 1. Basic 2. Advanced");
            int initial = myObj.nextInt();

            if (initial == 1) {
                System.out.println("Pick a function: 1. Add 2. Subtract 3. Multiply 4. Divide");
                int choice = myObj.nextInt();

                if (choice == 1) {

                    System.out.println("How many numbers to add?");
                    int amount = myObj.nextInt();
                    ArrayList<Integer> storage = new ArrayList<>();
                    int total = 0;

                    for (int i = 0; i < amount; i++) {

                        System.out.println("Enter number " + (i + 1));
                        int value = myObj.nextInt();
                        storage.add(value);

                    }

                    for (int j = 0; j < storage.size(); j++) {
                        total += storage.get(j);
                    }

                    System.out.println("Your totals is: " + total);
                }

                if (choice == 2) {
                    System.out.println("Enter biggest number");
                    int firstValue = myObj.nextInt();
                    System.out.println("Enter smallest number");
                    int secValue = myObj.nextInt();
                    System.out.println(firstValue - secValue);
                }

                if (choice == 3) {
                    System.out.println("Enter 1st number");
                    int firstValue = myObj.nextInt();
                    System.out.println("Enter 2nd number");
                    int secValue = myObj.nextInt();
                    System.out.println(firstValue * secValue);
                }

                if (choice == 4) {
                    System.out.println("Enter biggest number");
                    int firstValue = myObj.nextInt();
                    System.out.println("Enter smallest number");
                    int secValue = myObj.nextInt();
                    System.out.println(firstValue / secValue);
                }
            }


            if (initial == 2) {

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
    }
