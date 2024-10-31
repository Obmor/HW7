public class Main {
    public static void main(String[] args) {


        System.out.println();
        System.out.println("Exercise 1.");
        int sum = 15_000;
        int total = 0;
        int month = -1;
        while (total <= 2_459_000) {
            total = total + sum;
            total = total / 100 * 101;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total +
                    " рублей.");
        }


        System.out.println();
        System.out.println("Exercise 2.");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int b = 10; b <= 10 && b >= 1; b--) {
            System.out.print(b + " ");
        }
        System.out.println();


        System.out.println();
        System.out.println("Exercise 3.");
        int population = 12_000_000;
        int birth = 17;
        int death = 8;
        int growth = birth - death;
        for (int year = 1; year <= 10; year++) {
            population = population + population * growth / 1000;
            System.out.println("Год " + year + ", численность населения составляет " +
                    population + " человек.");
        }


        System.out.println();
        System.out.println("Exercise 4.");
        int startedSum = 15_000;
        int goalSum = 0;
        int monthEx4 = 0;
        while (goalSum <= 12_000_000) {
            goalSum = (goalSum + startedSum) / 100 * 107;
            monthEx4++;
            System.out.println("Месяц " + monthEx4 + ", накопления равны " + goalSum + " рублей.");
        }


        System.out.println();
        System.out.println("Exercise 5.");
        int startedSumEx5 = 15_000;
        int goalSumEx5 = 0;
        int monthEx5 = 0;
        while (goalSumEx5 <= 12_000_000) {
            goalSumEx5 = (goalSumEx5 + startedSumEx5) / 100 * 107;
            monthEx5++;
            if (monthEx5 % 6 == 0) {
                System.out.println("Месяц " + monthEx5 + ", накопления равны " + goalSumEx5 +
                        " рублей.");
            }
        }


        System.out.println();
        System.out.println("Exercise 6.");
        int startedSumEx6 = 15_000;
        int goalSumEx6 = 0;
        int monthEx6 = 0;
        int halfYear = 0;
        while (monthEx6 <= 9 * 12) {
            goalSumEx6 = (goalSumEx6 + startedSumEx6) / 100 * 107;
            monthEx6++;
            if (monthEx6 % 6 == 0) {
                halfYear++;
                System.out.println("Полугодие " + halfYear + ", накопления равны " +
                        goalSumEx6 + " рублей.");
            }
        }


        System.out.println();
        System.out.println("Exercise 7.");
        int friday = 3;
        while (friday <= 31) {
            System.out.println(friday);
            friday = friday + 7;
        }


        System.out.println();
        System.out.println("Exercise 8.");
        int startOfVisit = 0;
        int currentYear = 2024;
        int previousPeriod = currentYear - 200;
        int nextPeriod = currentYear + 100;
        do {
            startOfVisit = startOfVisit + 79;
            if (startOfVisit >= previousPeriod && startOfVisit <= nextPeriod) {
                System.out.println(startOfVisit);
            }
        }
        while (startOfVisit <= nextPeriod);
    }
}