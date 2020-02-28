package main;

import java.util.Scanner;

public class UserID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int employee = scanner.nextInt();
        scanner.nextLine();
        Solution[] array = new Solution[employee];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter user name: ");
            String userName = scanner.nextLine();
            System.out.println("Enter userId: ");
            int userId = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter company name: ");
            String companyName = scanner.nextLine();
            array[i] = new Solution(userName, userId, companyName);
        }
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(++j + ". " + array[i]);
        }
    }
}
