import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        float a = scanner.nextFloat();

        System.out.println("Введите операцию (+,-,*,/) ");
        char operation = scanner.next().charAt(0);

        System.out.println("Введите второе число: ");
        float b = scanner.nextFloat();

        if (operation == '+') {
            float result = a + b;
            System.out.println(a + "+" + b + "=" + result);
        }
        if (operation == '-') {
            float result = a - b;
            System.out.println(a + "-" + b + "=" + result);
        }
        if (operation == '*') {
            float result = a * b;
            System.out.println(a + "*" + b + "=" + result);
        }
        if (operation == '/') {
            float result = a / b;
            System.out.println(a + "/" + b + "=" + result);
        }
     }
}