package desafios;

import java.util.Scanner;

@SuppressWarnings("all")
public class NumeroSecreto {
    static void main() {

        int secreto = (int) (Math.random() * 100);
        /*System.out.print(secreto);*/

        Scanner teclado = new Scanner(System.in);

        int chute = -1;

        while(chute != secreto) {
            System.out.println("Digite um número (chute): ");
            chute = teclado.nextInt();
            teclado.nextLine();

            if (secreto > chute)  {
                System.out.println("O número secreto é MAIOR!");}
            else if(secreto < chute) {
                System.out.println("O número secreto é MENOR!");}

        }

        System.out.println("O número secreto é: " + secreto);

        teclado.close();
   }
}
