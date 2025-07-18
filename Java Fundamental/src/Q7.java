import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        String gender = args[0];
        int age = Integer.parseInt(args[1]);

        if (gender.equalsIgnoreCase("female") && age > 1 && age <= 58) {
            System.out.println("The percentage of Interest is: 8.2%");
        }

        if (gender.equalsIgnoreCase("female") && age >= 59 && age <= 100) {
            System.out.println("The percentage of Interest is: 9.2%");
        }

        if (gender.equalsIgnoreCase("male") && age > 1 && age <= 58) {
            System.out.println("The percentage of Interest is: 8.4%");
        }

        if (gender.equalsIgnoreCase("male") && age >= 59 && age <= 100) {
            System.out.println("The percentage of Interest is: 10.5%");
        }
    }
}

