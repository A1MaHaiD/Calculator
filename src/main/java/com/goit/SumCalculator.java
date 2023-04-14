package com.goit;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(sum(number));
    }

    public static int sum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("" + n + " must be more than 0");
        }
        return IntStream.rangeClosed(0, n).sum();
    }
}