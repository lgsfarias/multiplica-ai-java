import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);
        int number;

        System.out.println("enter a number to display its table:");
        number = Integer.parseInt(myScanner.nextLine());

        System.out.println("\nHere is " + number + "`s table:");
        myScanner.close();

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            String line = number + " * " + i + " = " + result;
            System.out.println(line);
        }
    }
}
