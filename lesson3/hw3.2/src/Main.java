import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Конвертер валют");

        System.out.println("Введите количество рублей: ");
        double rubles = scanner.nextDouble();

        double dollars = rubles * (1 / 63.5);
        double euro = rubles * (1 / 78.2);

        System.out.println(rubles + " рублей " + dollars + " долларов");
        System.out.println(rubles + " рублей " + euro + " евро");
    }
}
