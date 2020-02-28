package main;

import java.util.Scanner;

public class UserID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int employee = scanner.nextInt();
        scanner.nextLine();
        Solution[] array = new Solution[employee];
        for (int i = 0; i < array.length; i++) {
            String userName = scanner.nextLine();
            int userId = scanner.nextInt();
            scanner.nextLine();
            String companyName = scanner.nextLine();

        }
    }
}
