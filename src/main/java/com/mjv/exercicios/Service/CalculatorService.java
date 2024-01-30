package com.mjv.exercicios.Service;

import com.mjv.exercicios.Model.User;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorService {
  private User user = null;

  public void initialize(String name, String occupation, int age){
    user = new User();
    user.setName(name);
    user.setOccupation(occupation);
    user.setAge(age);
  }

  public String menu() {
    return String.format(
        """
        \n
        Olá %s, %s de %d anos. Por favor, selecione uma opção:
        [1] Soma
        [2] Subtração
        [3] Multiplicação
        [4] Divisão
        [5] Sair
        """,
        user.getName(), user.getOccupation(), user.getAge()
    );
  }

  public double sum(double n1, double n2) {
    return n1 + n2;
  }

  public double sub(double n1, double n2) {
    return n1 - n2;
  }

  public double mult(double n1, double n2) {
    return n1 * n2;
  }

  public double div(double n1, double n2) {
    return n1 / n2;
  }

  public void startCalculator() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println(menu());

      try {
        int option = scanner.nextInt();

        if (option > 5 || option < 1) {
          System.out.print("\nOpção inválida. Por favor, tente novamente.");
          continue;
        }

        if (option == 5) {
          System.out.print("\nSaindo da calculadora. Até logo!");
          break;
        }

        double num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        double result;

        switch (option) {
          case 1:
            result = sum(num1, num2);
            break;
          case 2:
            result = sub(num1, num2);
            break;
          case 3:
            result = mult(num1, num2);
            break;
          case 4:
            if (num2 == 0) {
              System.out.print("\nDivisão por zero não permitida.");
              continue;
            }
            result = div(num1, num2);
            break;
          default:
            continue;
        }

        System.out.printf("\nResultado: %.2f", result);
      }
      catch (InputMismatchException e) {
        System.out.print("\nEntrada inválida. Certifique-se de digitar apenas números.");
        scanner.nextLine();
      }
    }

    scanner.close();
  }
}
