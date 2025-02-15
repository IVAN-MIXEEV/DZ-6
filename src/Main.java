public class Main {
    public static void main(String[] args) {
//№1
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
//№2
        for (int i = 10; i >= 1; i--) {
            System.out.println("Итерация цикла " + i);
        }
//№3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Итерация цикла " + i);
        }
//№4
        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация цикла " + i);
        }
//№5
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным.");
        }
//№6
        for (int i = 7; i < 98; i = i + 7) {
            System.out.println("Итерация цикла " + i);
        }
//№7
        int i = 1;
        for (i = 1; i < 513; i = i * 2) {
            System.out.println(i);
        }
//№8
        int deposit = 29000;
        int total = 0;
        for (int month = 1; month <= 12; month++) {
            total = total + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total);
        }
//№9
        int deposit1 = 29000;
        int total1 = 0;
        for (int month1 = 1; month1 <= 12; month1++) {
            total1 = total1 + total1 / 120;
            total1 = total1 + deposit1;
            System.out.println("Месяц " + month1+ ", сумма накоплений равна " + total1);
        }
//№10
        int multiplication = 2;
        int sum = 0;
        for (int t = 1; t <= 10; t++) {
            sum = sum + multiplication;
            System.out.println("2 * " + t + " = " + sum);
        }
    }
}


