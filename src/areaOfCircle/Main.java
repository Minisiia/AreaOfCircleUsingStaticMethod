package areaOfCircle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть радіус:");
        int myRadius = scanner.nextInt();
        System.out.println("Площа круга дорівнює - " + MyArea.areaOfCircle(myRadius));
    }
}
