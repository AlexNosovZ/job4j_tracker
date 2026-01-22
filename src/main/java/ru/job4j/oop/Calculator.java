package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int minus(int y) {
        return y - x;
    }

    public static int sum(int y) {
        return x + y;
    }

    public int divide(int y) {
        return y / x;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + multiply(y) + divide(y);
    }

    public static void main(String[] args) {
        Calculator demo = new Calculator();
        int result = sum(10);
        System.out.println(result);
        result = minus(10);
        System.out.println(result);
        result = demo.multiply(10);
        System.out.println(result);
        result = demo.divide(10);
        System.out.println(result);
        result = demo.sumAllOperation(10);
        System.out.println(result);
    }
}
