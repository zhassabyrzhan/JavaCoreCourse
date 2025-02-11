import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Конвертер валют");

        System.out.println("Введите количество рублей: ");
        double rubles = scanner.nextDouble();

        int one = 1;

        double dollarsRate = 63.5;
        double eurosRate = 78.2;

        double dollars = rubles * (one / dollarsRate);
        double euro = rubles * (one / eurosRate);

        System.out.println(rubles + " рублей " + dollars + " долларов");
        System.out.println(rubles + " рублей " + euro + " евро");
    }
}
