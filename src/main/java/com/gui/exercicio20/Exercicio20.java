package com.gui.exercicio20;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine().trim();

        System.out.print("Preço do produto: ");
        if (scanner.hasNextDouble()) {
            double preco = scanner.nextDouble();

            if (nome.isEmpty() || !Double.isFinite(preco) || preco < 0) {
                System.out.println("Nome ou preço inválido.");
            } else {
                Produto produto = new Produto(nome, preco);
                System.out.printf("Produto cadastrado: %s - R$ %.2f%n",
                        produto.getNome(), produto.getPreco());
            }
        } else {
            System.out.println("Digite um preço numérico.");
        }

        scanner.close();
    }
}
