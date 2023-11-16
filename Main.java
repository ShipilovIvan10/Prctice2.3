import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Объект считывания из консоли
        //Scanner scanner = new Scanner(System.in);

        //Переменная - номер задания
        byte taskNumber;

        do {
            //Приглашение
            System.out.println("Введите номер задания [1-5] (0 - для выхода из программы): ");

            //Считаем номер задания
            taskNumber = scanner.nextByte();

            //Выполним метод в зависимости от введённого номера
            switch (taskNumber){
                case 0:
                    System.out.println("Введён код выхода из программы!");
                    System.exit(0);
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;
                case 5:
                    task5();
                    break;
                default:
                    System.out.println("Введён некорректный номер задания! Всего 5 заданий. Повторите ввод или введите 0 для выхода");
            }
        } while(true);
    }

    public static void task1(){

        //Приглашение ввести число
        System.out.printf("Введите шестизначное число: ");

        //Число для манипулирования
        int number = scanner.nextInt(10);

        //Преверка на разраядность, равную 6
        if (number > 999_999 || number < 100_000){
            System.out.println("Вы ввели не шестизначное число! Повторно запустите это задание.");
            return;
        }

        //Цифра
        byte digit;

        //Сумма первых трёх и вторых трёх
        byte sum1 = 0;
        byte sum2 = 0;

        //Цикл по младшим трём разрядам
        for (int i=5; i>=0; i--) {

            if (i <= 5 && i > 2) {
                sum1 += (byte) (number % 10);
            } else {
                sum2 += (byte) (number % 10);
            }

            number /= 10;
        }

        //Вывод результата
        if (sum1==sum2){
           System.out.println("Число счастливое!");
        } else {
            System.out.println("Число не является счастливым!");
        }
    }

    public static void task2(){

        //Приглашение
        System.out.println("Введите шестизначное число:");

        int number = scanner.nextInt();

        if (number < 100_000 || number > 999_999){
            System.out.println("Введенное число не является шестизначным! Осущетвите повторный вызов этого задания.");
            return;
        }

        //Итератор
        char digit;

        //Создаём стрингбилдер
        StringBuilder stringBuilderSource = new StringBuilder(String.valueOf(number));
        StringBuilder stringBuilderResult = new StringBuilder();

        //Переменная для цифры
        byte i =  (byte) (stringBuilderSource.length());

        while (--i >= 0){

           if (i==2 || i==3){
               digit = stringBuilderSource.charAt(stringBuilderSource.length() - 1 - i);
           }
           else {
               digit = stringBuilderSource.charAt(i);
           }
               stringBuilderResult.append(digit);
        }

        System.out.println("Частично реверсированное число: " + stringBuilderResult);
    }

    public static void task3(){

        //Приглашение
        System.out.println("Введите номер месяца: ");

        byte monthNumber = scanner.nextByte();

        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12){
            System.out.println("Winter");
        }
        else if (monthNumber >=3 && monthNumber <= 5){
            System.out.println("Spring");
        }
        else if (monthNumber >= 6 && monthNumber <= 8){
            System.out.println("Summer");
        }
        else if (monthNumber >= 9 && monthNumber <= 11){
            System.out.println("Autumn");
        }
        else {
            System.out.println("Вы ввели неверный номер месяца. Месяцев в году 12!");
        }
    }

    public static void task4(){

        System.out.printf("Введите номер месяца: ");

        byte monthNumber = scanner.nextByte();

        switch (monthNumber){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Вы ввели некорректный номер месяца! В году 12 месяцев.");
        }
    }

    public static void task5(){

        System.out.printf("Введите число (от 1 до 100): ");

        byte number = scanner.nextByte();

        if (number<1 || number > 100) {
            System.out.println("Вы ввели число, не соответствующее условиям задачи! Повторите запуск этого задания.");
            return;
        }

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Fizz Buzz");
        }else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0){
            System.out.println("Buzz");
        }
        else {
            System.out.println(number);
        }
    }

}