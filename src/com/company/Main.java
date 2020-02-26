package com.company;

import java.util.Scanner;

public class Main {

    private static int a = 10;

    public static void main(String[] args) {
        //ax^2 + bx + c=0
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter A");
        double a = scanner.nextDouble();

        System.out.println("enter B");
        double b = scanner.nextDouble();

        System.out.println("enter C");
        double c = scanner.nextDouble();

        Pair solutions = getSolution(a, b, c);
        if (solutions == null) {
            System.out.println("no fall");
        } else if (solutions.solutionTwo == null) {
            System.out.println("catapult and bullet in one point " + solutions.solutionOne);
        } else {
            double result = Math.abs(Math.abs(solutions.solutionOne) - Math.abs(solutions.solutionTwo));
            System.out.println("distance " + result);
        }
    }

    static Pair getSolution(double a, double b, double c) {

        Pair result = new Pair();
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d < 0) {
            return null;
        } else if (d == 0) {
            result.solutionOne = -b / 2.0 * a;
        } else {
            result.solutionOne = (-b + Math.sqrt(d)) / 2.0 * a;
            result.solutionTwo = (-b - Math.sqrt(d)) / 2.0 * a;
        }

        return result;
    }

    static Pair getSolution2(double a, double b, double c) {
        Pair result = new Pair();
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d < 0) {
            return null;
        } else if (d == 0) {
            result.solutionOne = -b / 2.0 * a;
        } else {
            result.solutionOne = (-b + Math.sqrt(d)) / 2.0 * a;
            result.solutionTwo = (-b - Math.sqrt(d)) / 2.0 * a;
        }

        return result;
    }
}

class Pair {
    Double solutionOne;
    Double solutionTwo;
}