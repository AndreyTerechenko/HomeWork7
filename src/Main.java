public class Main {
    public static void main(String[] args) {
        // Задача 1
        double sum = 0;
        int month = 0;
        double contribution = 0;
        while (sum <= 2_459_000) {
            sum = sum + sum / 100 * 1;
            sum = sum + contribution + 15000;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + (long) sum);
            // Тут я не понял. В описании задачи не стоят проценты, а в критериях оценки стоят.
            // Высчитал месяци с учетом процентов
        }
        // Задача 2
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        // Задача 3
        double population = 12000000;
        int birthКRate = 17;
        int mortality = 8;
        double populationGrowth = 0;
        int year = 0;
        for (; year <= 10; year++) {
            population = population + populationGrowth;
            populationGrowth = (population / 1000 * birthКRate) - (population / 1000 * mortality);
            System.out.println("Год " + year + ", численность населения составляет " + (long) population);
        }
        // Задача 4
        sum = 0;
        month = 0;
        contribution = 15000;
        while (sum < 12_000_000) {
            sum = sum + sum / 100 * 7;
            sum = sum + contribution;
            month = month + 1;
            System.out.println(month + " Месяц, накопления составили " + (int) sum);
            // На первый месяц процент не считем ,
            // так как это первый вклад и процент начисляется после него ( если не ошибаюсь )
        }
        // Задача 5
        sum = 0;
        month = 0;
        contribution = 15000;
        while (sum < 12_000_000) {
            sum = sum + sum / 100 * 7;
            sum = sum + contribution;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println(month + " Месяц, накопления составили " + (int) sum);
            }
        }
        // Задача 6
        sum = 0;
        month = 0;
        contribution = 15000;
        while (month < 12 * 9) {
            sum = sum + sum / 100 * 7;
            sum = sum + contribution;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println(month + " Месяц, накопления составили " + (int) sum);
            }
        }
        // Зажача 7
        int friday = 1;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + " число. Необходимо подготовить отчет");
            friday = friday + 7;
        }

        // Задача 8
        for (year = 1824; year <= 2124; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}
