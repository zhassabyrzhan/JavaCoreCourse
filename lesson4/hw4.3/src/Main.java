import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в мой супер-простецкий калькулятор 👋\n");
        System.out.println("Какое действие вы бы хотели произвести?");
        System.out.println("Сложение (1) | Вычитание (2) | Деление (3)\n");
        System.out.println("Внимание!!! Работает только с целыми числами!!!");
        System.out.println("Посказка: Введите число 1, 2 или 3");

        double userInput = scanner.nextDouble();

        if (userInput == 1) {
            System.out.println("Введите первое число:");
            double firstNumber = scanner.nextDouble();

            System.out.println("Введите второе число:");
            double secondNumber = scanner.nextDouble();

            double result = firstNumber + secondNumber;

            System.out.println("Результат сложения: " + result);

        } else if (userInput == 2) {
            System.out.println("Введите первое число:");
            double firstNumber = scanner.nextDouble();

            System.out.println("Введите второе число:");
            double secondNumber = scanner.nextDouble();

            double result = firstNumber - secondNumber;

            System.out.println("Результат вычитания: " + result);
        } else if (userInput == 3) {
            System.out.println("Введите первое число:");
            double firstNumber = scanner.nextDouble();

            System.out.println("Введите второе число:");
            double secondNumber = scanner.nextDouble();

            double result = firstNumber / secondNumber;

            System.out.println("Результат деления: " + result);
        }

    }
}
