package com.vadim19.CalculateNumber;

import java.util.Scanner;

public class CalculateNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int respounce;
        double numberLow;
        double numberHight;
        double number;
        respounce = 0;
        numberLow = 1;
        numberHight = 101;
        while (respounce != 2) {
            number = Math.floor((numberLow + numberHight) / 2);
            System.out.println("Ваше число" + " " + number + "?");
            respounce = Integer.parseInt(scanner.nextLine());
            if (respounce == 2) {
                System.out.println("Вітаємо");
            } else if (respounce == 1) {
                numberLow = number;
            } else if (respounce == 0) {
                numberHight = number;
            }

        }
        return;
    }

}
