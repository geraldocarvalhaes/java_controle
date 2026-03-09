package condicionais;

@SuppressWarnings("all")
public class DesafioIf {
    static void main() {
        boolean tenhoDinheiro = true;
        boolean estaComSol = false;

        /* condição não será obedecida pois o ; quebra o codigo.
        if(tenhoDinheiro && estaComSol);
        {
            System.out.println("Vou para o shopping!");
        }
        */

        if(tenhoDinheiro && estaComSol)
            System.out.println("Vou para o shopping!");
        System.out.println("Fim!");
    }
}
