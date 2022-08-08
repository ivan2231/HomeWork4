public class Main{
    public static void main(String[] args) {
        //Задание 1
        int client0s = 0;
        if (client0s == 0) {
            System.out.println("У вас андроид");
        } else if (client0s == 1) {
            System.out.println("У вас ios");
        } else {
            System.out.println("ОС не найдена");
        }


        //Задание

        int year = 2015;
        if (client0s == 0 && year > 2019) {
            System.out.println("Установил обычную версию андройда");

        } else if (client0s == 0 && client0s < 2019) {
            System.out.println("Установите обычную версию андройда");
        } else if (client0s == 1 && client0s > 2019) {
            System.out.println("Установите обычную версию ios");
        } else if (client0s == 1 && client0s < 2019) {
            System.out.println("Установите lite версию ios");
        } else {
            System.out.println("Ваше устройство не поддерживается");
        }


        //Задание3
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("Год %s високосный", year);
        } else {
            System.out.printf("Год %s не високосный", year);
        }
        //Задание4
        int deliveryDistance = 60;
        if (deliveryDistance > 0 && deliveryDistance < 20) {
            System.out.println("Доставка за один день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Доставка за три дня");
        } else
            System.out.println("Сюда не доставляет");

        //Задание5
        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весений месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 0:
            case 11:
                System.out.println("Осений месяц");
            default:
                System.out.println("Такого месяца не бывает");
        }
    }

            }
