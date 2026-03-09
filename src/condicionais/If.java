package condicionais;

import java.util.Scanner;

public class If {
    static void main(){

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a média do aluno: ");
        double media = Double.parseDouble(teclado.nextLine().replace(',','.'));

        if (media >= 7 && media <= 10){
            System.out.println("Aluno aprovado!");
        }

        if (media <7 && media >= 4.5){
            System.out.println("Aluno em recuperação!");
        }

        boolean criterioreprovacao = media < 4.5 && media >0;
        if (criterioreprovacao){
            System.out.print("Aluno reprovado!");
        }

        System.out.print("FIM!!");
        teclado.close();
    }
}
