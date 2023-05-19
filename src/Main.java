import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 1997;
        checkYear(year);
    }

    public static void checkPhone(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Такой операционной системы не существует");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2021;
        checkPhone(clientOS, clientDeviceYear);
    }

    public static int checkDistance(int deliveryDistance) {
        int timeDelivery = 0;
        if (deliveryDistance <= 20) {
            timeDelivery++;
        } else if (deliveryDistance <= 60) {
            timeDelivery += 2;
        } else if (deliveryDistance <= 100) {
            timeDelivery += 3;
        }
        return timeDelivery;
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        if (checkDistance(deliveryDistance) != 0) {
            System.out.println("Потребуется дней для доставки: " + checkDistance(deliveryDistance));
        } else {
            System.out.println("Доставки нет");
        }
    }
}