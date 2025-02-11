import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Преобразование температуры " +
                "по Цельсию в температуры по Фарингейту");

        System.out.println("Введите температуру по Цельсию: ");
        double tempCelsius = scanner.nextDouble();

        double tempFahrenheit = tempCelsius * 1.8 + 32;

        System.out.println("Результат: " + tempFahrenheit);

    }
}
