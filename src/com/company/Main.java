package com.company;

public class Main {

    public static void main(String[] args) {
	// Задание 1
        int iOS = 0;
        int android = 1;
        int clientOS = 0;
        if (clientOS == iOS) {
            System.out.println("Install the iOS version of the app by following the link");
        } else if (clientOS == 1) {
            System.out.println("Install the Android version of the app by following the link");
        }

        // Задание 2
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Install the lite version of the iOS app by following the link");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Install the lite version of the Android app by following the link");
        }

        // Задание 3
        int year = 2021;
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        if (leapYear) {
            System.out.println( + year + " is a leap year");
        } else {
            System.out.println( + year + " is not a leap year");
        }

        // Задание 4
        int deliveryDistance = 95;
        boolean deliveryTime1 = deliveryDistance <= 20;
        boolean deliveryTime2 = deliveryDistance > 20 && deliveryDistance <=  60;
        boolean deliveryTime3 = deliveryDistance > 60 && deliveryDistance <= 100;
        if (deliveryTime1) {
            System.out.println("It will take 1 day");
        }
        if (deliveryTime2) {
            System.out.println("It will take 2 days");
        }
        if (deliveryTime3) {
            System.out.println("It will take 3 days");
        }

        // Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Month input error");


        }





    }
}
