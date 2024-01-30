package com.mjv.exercicios;

import com.mjv.exercicios.Service.CalculatorService;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    CalculatorService calc = new CalculatorService();

    System.out.print("Type your name: ");
    String name = scanner.nextLine();

    System.out.print("Type your occupation: ");
    String occupation = scanner.nextLine();

    System.out.print("Type your age: ");
    int age = scanner.nextInt();

    calc.initialize(name, occupation, age);
    calc.startCalculator();

    scanner.close();
  }
}
