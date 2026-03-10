package condicionais;

import java.util.Scanner;

@SuppressWarnings("all")
public class ifElse{

    static void main(){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o número: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número PAR!");
        } else {
            System.out.println("Numero IMPAR!");
        }

        teclado.close();

    }

}
