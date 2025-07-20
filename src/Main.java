//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        {

        }
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2490000) {
            i++;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задача 2");
        int d = 0;
        while (d < +10) {
            d++;
            System.out.print(d + " ");//n
        }
        System.out.println();
        for (int a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("Задача 3");
        int populationY = 12000000;
        int mortalityRate = 8;
        int birthRate = 17;
        int years = 10;
        for (i = 1; i <= years; i++) {
            int newBiths = populationY*birthRate/1000;
            int deaths = populationY*mortalityRate/1000;
            populationY = populationY+newBiths-deaths;
            System.out.println("Год " + i + " численность населения составляет " + populationY);
        }
        System.out.println("Задача 4");
        int depositAmount = 15000;
        int total1 = 0;
        i = 1;
        for (; total1 < 12000000; i++) {
            total1 = total1 + (total1 / 100 * 7);
            total1 = total1 + depositAmount;
            System.out.println("Месяц " + i + " накоплено " + total1 + " рублей");
        }
        System.out.println("Задача 5");
        int depositAmount2 = 15000;
        int total2 = 0;
        i = 1;
        for (; total2 < 12000000; i++) {
            total2 = total2 + (total2 / 100 * 7);
            total2 = total2 + depositAmount2;
            if (i % 6 == 0) {
                {
                    System.out.println("Месяц " + i + " накоплено " + total2 + " рублей");
                }
            }

        }
        System.out.println("Задача 6");
        int depositAmount3 = 15000;
        int total3 = 0;
        i = 1;
        int periogYear = 9;
        int periodOnMounth = periogYear * 12;

        for (; i <= periodOnMounth; i++) {
            total3 = total3 + depositAmount3;
            total3 = total3 + (total3 / 100 * 7);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " накоплено " + total3 + " рублей");
            }
        }

        System.out.println("Задача 7");
        int firstFriday = 4;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница " + day + " -е число. Необходимо подготовить отчет");

        }
        System.out.println("Заддача 8");
        int nowYear = 2025;
        int yearStart = nowYear - 200;
        int yearFinish = nowYear + 100;
        int period = 79;
        for (int cometFall = 0; cometFall < yearFinish; cometFall = cometFall+period) {
            if (cometFall>yearStart && cometFall<yearFinish)
                System.out.println(cometFall);
        }
    }
}



