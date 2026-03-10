package repeticao;

public class For3 {

    static void main(){
        // i = linha >> j = coluna
        for (int i = 0; i< 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.printf("%dx%d ", i, j);
            }
            System.out.println();
        }
        System.out.println("FIM!");
    }
}
