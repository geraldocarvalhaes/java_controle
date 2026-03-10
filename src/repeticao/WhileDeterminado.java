package repeticao;

public class WhileDeterminado {
    static void main(){

        //precisamos de 3 elementos
        // 1 - Criar uma variável de controle
        int i = 1;
        // 2 - Expressão usar a variável
        while( i <= 10){
            System.out.println(i);
            // 3 - Incrementar a variável até a expressão mudar.
            i++;
        }
        System.out.println("FIM;");
    }
}
