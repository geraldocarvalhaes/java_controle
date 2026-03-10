package repeticao;

import java.util.Scanner;
@SuppressWarnings("all")
public class DoWhile {

    static void main(){
        Scanner teclado = new Scanner(System.in);
        String comando = "sair";
        do {
            System.out.print("Informe o comando ou sair: ");
            comando = teclado.nextLine();
            System.out.println("Comando: " + comando);
        }while(!comando.equals("sair"));
        System.out.println("FIM");
        teclado.close();
    }
}
