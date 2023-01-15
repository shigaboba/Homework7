public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int monthPayment = 15000;
        int total = 0;
        int i = 0;
        while ( total <= 2459000) {
            i++;
            total = total +  monthPayment;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while ( i <= 10) {
            System.out.print( i + " ");
            i++;
        }
        System.out.println();
        for ( i = 10; i >= 1; i = i - 1){
            System.out.print( i + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        double population = 12000000;
        int i = 1;
        while ( i <= 10) {
            population = population + population*0.017 - population*0.008;
            System.out.println ( "Год " + i + ", численность населения составляет " + population);
            i++;
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double savings = 15000;
        int i = 1;
        while ( savings <= 12000000) {
            savings = savings * 1.07;
            System.out.println ("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
            i++;
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double savings = 15000;
        int i = 1;
        while ( savings <= 12000000) {
            savings = savings * 1.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
            }
            i++;
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double savings = 15000;
        int i = 1;
        while ( i <= 9*12) {
            savings = savings * 1.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
            }
            i++;
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int date = 6;
        while ( date <= 31) {
            System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет");
            date = date + 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 2022;
        for ( int i = year - 200; i <= year + 100; i++ ) {
            if (i % 79 == 0) {
            System.out.println(i);}
        }
    }
}