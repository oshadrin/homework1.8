public class Main {
    public static void main(String[] args) {
//        Task 1
        int currantYear = 1952;
        checkLeapYear(currantYear);
//        Task 2
        int clientDeviceYear = 2014;
        int clientOS = 1;
        identifyDevice (clientDeviceYear, clientOS);
//        Task 3
        int deliveryDistance = 90;
        determinateTimeOfDelivery(deliveryDistance);
    }
//Task 1

    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
    }
//Task 2

    public static void identifyDevice (int device, int os) {
          if (device < 2015 && os == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (device < 2015 && os == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (device >= 2015 && os == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (device >= 2015 && os == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("ОС не распознана");
        }
    }
// Task 3
    public static void determinateTimeOfDelivery (int distance) {
          if (distance < 20 && distance >= 0) {
            System.out.println("срок доставки дней: 1");
        } else if (distance >= 20 && distance <60) {
            System.out.println("срок доставки дней: 2");
        } else if (distance >= 60 && distance <= 100) {
            System.out.println("срок доставки дней: 3");
        } else if (distance > 100) {
            System.out.println("На такое расстояние доставка не производится");
        } else {
            System.out.println("Некорректно указанно расстояние");
        }
    }

}