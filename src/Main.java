import java.util.Scanner;

public class Main {
    //Конвертор валют
    public static void main(String[] args) {
        //1. Получить сумму в рублях
        //2. Выбор валюты доллара, евро
        //3. Посчитать сумму в валюте
        start();
    }

    public static void start() {
        System.out.println("Введите сумму:");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();

        System.out.println("Выберите валюту:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        int choiceType = scanner.nextByte();

        String result = convert(sum, choiceType);
        int resultPoint = result.indexOf(".");
        String resultRub = result.substring(0, resultPoint + 3);
        System.out.println("По текущему курсу сумма составит: " + resultRub);
        start();
    }

    public static String convert(int sum, int choiceType) {
        double rubToUSD = 0.012747;
        double rubToEUR = 0.010894;

        switch (choiceType) {
            case 1:
                double usdResult = sum * rubToUSD;
                return String.valueOf(usdResult);
            case 2:
                double eurResult = sum * rubToEUR;
                return String.valueOf(eurResult);

        }
        return "0";
    }
}

