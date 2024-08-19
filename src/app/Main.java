package app;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Введіть ціле число: ");
        int num = scanner.nextInt();
        printSquare(num);

        System.out.print("\n2. Введіть радіус циліндра: ");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту циліндра: ");
        double height = scanner.nextDouble();
        double volume = calculateCylinderVolume(radius, height);
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume + ".");

        int[] array = {10, 20, 30, 40, 50};
        int sum = calculateSum(array);
        System.out.println("\n3. Масив чисел: " + java.util.Arrays.toString(array));
        System.out.println("Сума всіх елементів масиву дорівнює " + sum + ".");

        scanner.nextLine();
        System.out.print("\n4. Введіть рядок: ");
        String inputString = scanner.nextLine();
        String reversedString = reverseString(inputString);
        System.out.println("Рядок в зворотньому порядку: " + reversedString);

        System.out.print("\n5. Введіть a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть b: ");
        int b = scanner.nextInt();
        int powerResult = calculatePower(a, b);
        System.out.println("Результат " + a + "^" + b + " дорівнює " + powerResult + ".");

        System.out.print("\n6. Введіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть текстовий рядок: ");
        String text = scanner.nextLine();
        repeatText(n, text);

        scanner.close();
    }

    public static void printSquare(int num) {
        int square = num * num;
        System.out.println("Квадрат числа " + num + " дорівнює " + square + ".");
    }

    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int calculatePower(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static void repeatText(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}
