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
        System.out.println("Введите сумму в рулях:");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();

        System.out.println("Выберите валюту:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. CNY");
        int choiceType = scanner.nextByte();

        String result = convert(sum, choiceType);
        int resultPoint = result.indexOf(".");
        String resultRub = result.substring(0, resultPoint + 3);
        if (choiceType == 1) {
            System.out.println("Ваша сумма в долларах: " + resultRub + " USD");
        } else if (choiceType == 2) {
            System.out.println("Ваша сумма в евро: " + resultRub + " EUR");
        } else if (choiceType == 3) {
            System.out.println("Ваша сумма в юанях: " + resultRub + " CNY");
        }
        start();
    }

    public static String convert(int sum, int choiceType) {
        double rubToUSD = 0.012747;
        double rubToEUR = 0.010894;
        double rubToCNY = 0.090368;

        switch (choiceType) {
            case 1:
                double usdResult = sum * rubToUSD;
                return String.valueOf(usdResult);
            case 2:
                double eurResult = sum * rubToEUR;
                return String.valueOf(eurResult);
            case 3:
                double cnyResult = sum * rubToCNY;
                return String.valueOf(cnyResult);

        }
        return "0";
    }
}

