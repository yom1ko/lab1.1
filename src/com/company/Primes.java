package com.company;
import javafx.application.Application;


public class Primes {

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true; //условие, является ли аргумент простым числом
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { //проверка простое число
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(i);
            }
        }
    }
}
