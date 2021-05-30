package ru.job4j.oop.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }
    public static double subtractionAndDivision(double first, double second) {
        return subtraction(first, second) + division(first, second);
    }
    public static double sumAndMultiplyAndSubAndDiv(double first, double second) {
        return sumAndMultiply(first, second)
              + subtractionAndDivision(first, second);

    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subtractionAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndSubAndDiv(10, 20));
    }
}
