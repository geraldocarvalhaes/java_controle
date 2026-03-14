package desafios;

import java.util.Scanner;

@SuppressWarnings("all")
public class OperacoesMatematicas {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.print("Menu\n-------\n1) Somar\n2) Subrair\n3) Sair\nInforme a opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine(); // \n

            if (opcao != 3) {
                System.out.print("Informe o primeiro valor: ");
                double  valor1 = teclado.nextDouble();
                teclado.nextLine();

                System.out.print("Informe o segundo valor: ");
                double  valor2 = teclado.nextDouble();
                teclado.nextLine();

                double resultado = 0;

                switch (opcao) {
                    case 1: resultado = resultado + (valor1 + valor2);
                    case 2: resultado = resultado + (valor1 - valor2);
                }
                System.out.printf("Resultado: %.2f\n\n", resultado);
            }

        }
        teclado.close();
    }
}
