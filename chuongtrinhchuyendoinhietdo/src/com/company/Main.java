package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double doF;
        double doC;
        int choice;
        do{

            System.out.println("Menu.");
            System.out.println("1. Celsius To Fahrenheit  ");
            System.out.println("2. Fahrenheit To Celsius  ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Chuyen do C sang do F");
                    System.out.print("Nhap do C");
                    doC=scanner.nextDouble();
                    System.out.println("Do F la:"+chuyendoCsangdoF(doC));
                    break;
                case 2:
                    System.out.println("Chuyen do F sang do C");
                    System.out.print("Nhap do F");
                    doF=scanner.nextDouble();
                    System.out.println("Do C la:"+chuyendoFsangdoC(doF));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);

    }
    public static double chuyendoCsangdoF(double C){
        double doF=(9.0 / 5) * (C + 32);
        return doF;
    }
    public static double chuyendoFsangdoC(double F){
        double doC=(5.0 / 9) * (F - 32);
        return doC;
    }
}

