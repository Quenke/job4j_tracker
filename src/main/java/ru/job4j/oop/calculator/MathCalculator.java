package ru.job4j.oop.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }
    public static double subtractionAndDivision(double first, double second) {
        return ru.job4j.math.MathFunction.subtraction(first, second)
                + ru.job4j.math.MathFunction.division(first, second);
    }
    public static double sumAndMultiplyAndSubAndDiv(double first, double second) {
        return MathCalculator.sumAndMultiply(first, second)
                + MathCalculator.subtractionAndDivision(first, second);

    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subtractionAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndSubAndDiv(10, 20));
    }
}
