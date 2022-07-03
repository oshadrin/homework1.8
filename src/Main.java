public class Main {
    public static void main(String[] args) {
//        Task 1
        int currantYear = 2022;
        checkLeapYear(currantYear);
//        Task 2
        int clientDeviceYear = 2018;
        int clientOS = 0;
        identifyDevice (clientDeviceYear, clientOS);
//        Task 3
        int deliveryDistance = 13;
        determinateTimeOfDelivery(deliveryDistance);
    }
//Task 1

    public static void checkLeapYear(int year) {
        if (((year % 4) == 0 || (year % 400) == 0) && (year % 100) != 0) {
            System.out.println(year + " год является високосным");
        }else {
            System.out.println(year + " год не является високосным");
        }
    }
//Task 2

    public static void identifyDevice (int device, int os) {
        if (device < 2015 && os == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (device > 2015 && os == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (device > 2015 && os == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }
// Task 3
    public static void determinateTimeOfDelivery (int distance) {
        int days = 1;
        if (distance < 0) {
            System.out.println("Некорректно указанно расстояние");
        } else if (distance < 20) {
            System.out.println("срок доставки дней: " + days);
        } else if (distance > 20) {
            days++;
            System.out.println("срок доставки дней: " + days);
        } else if (distance > 60 && distance < 100) {
            days++;
            System.out.println("срок доставки дней: " + days);
        } else {
            System.out.println("На такое расстояние доставка не производится");
        }
    }

}