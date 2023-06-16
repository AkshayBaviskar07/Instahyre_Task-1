package com.temprature;
import java.util.Scanner;

public class Main {

    public static void celcToFarenheit(){

        Scanner sc = new Scanner(System.in);
        System.out.println("-Enter Temperature (in celcius)-");
        float temp = sc.nextFloat();
        float result = (temp * 9 / 5) + 32;

        System.out.println(result+" Farenheit");
        System.out.println("-----------------------------------");
    }

    public static void farenheitToCel(){

        Scanner sc = new Scanner(System.in);
        System.out.println("-Enter Temperature (in farenheit)");
        float temp = sc.nextFloat();
        float result = (temp - 32) / 5*9;

        System.out.println(result+" Celcius");
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("---Welcome To Temperature Converter---");

        do{
            System.out.println("Choose temperature format you want to convert \n1.In Farenheit \n2.In Celcius");
            int tempChoice = sc.nextInt();

            switch(tempChoice){
                case 1: celcToFarenheit();
                        break;

                case 2: farenheitToCel();
                        break;

                default:
                    System.out.println("Invalid Choice");
            }

            System.out.println("---Do you want to continue press(1) to continue (0) to exit---");
            choice = sc.nextInt();

            if(choice == 0){
                System.out.println("Thank you for using this app.");
                System.out.println("-------------------------------------------------------------");
            }
        }while(choice != 0);
    }
}
