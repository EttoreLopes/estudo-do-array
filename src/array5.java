
/**
 * Estudo array - exemplo 5 - percorrendo um array com o laço for e foreach
 * @author ettore
 */
public class array5 {
    public static void main(String[] args) {
        // iniciando um array de tamanho variável
        int[] pares = (2,4,6,8);
        // a estrutura abaixo percorre o array de 0 até o seu tamanho máximo
        for (int i = 0; i < pares.length; i++) {
            System.out.println("pares["+ i +"] = " + pares[i]);
            
        }
        
    }
}
