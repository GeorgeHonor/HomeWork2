package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //exercise №1
        int clientOS = 1;
        if (clientOS < 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS >= 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        //exercise №2
        int clientDeviceYear = 2015;
        int clientDeviceOS = 1;
        if (clientDeviceOS == 1) {
            if (clientDeviceYear >= 2015) {

            System.out.println("Зайдите в Play Market для установки приложения");
        } else {
            System.out.println("Установите облегченную версию приложения по ссылке");
        }
        } else {
            if (clientDeviceOS != 1) {
            System.out.println("Зайдите в App Store для установки проложения");
        } else {
                System.out.println("Установите облегченную версию приложения по ссылке");
            }
            }



        //exercise №3
        int year = 2008;
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");

        } else {
            System.out.println(year + " год не является високосным");
        }





        //exercise №4
        int deliveryDistance = 95;
        int daysNumber = 1;
        if (deliveryDistance > 20) {
            daysNumber = daysNumber + 1;
            //daysNumber++;
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            daysNumber = daysNumber + 1;

        }
        System.out.println("Потребуется дней " + daysNumber);






        //exercise №5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;


        }







    }

}
