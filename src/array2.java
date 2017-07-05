/**
 * Estudo do array - exemplo 2 - Sorteio de uma carta
 * @author ettore
 */
public class array2 {
    public static void main(String[] args) {
    String[] nipes=("Espadas","paus","Copas","Ouros");
    String[] faces=("Az","2","3","4","5","6","7","8","9","10","valete","Dama","rei");
    // A linha abaixo cria um ojetivo chamado sorteio usando como modelo a classe Random
    Random sorteio = new Random();
    // a linha abaixo fez o sorteio do indice de nipes, usando o objeto sorteio e atribui o resultado a variável indice_face
    // o número (4) gera números alatórios no intervalode 0 até 3
    int indice_nipe = sorteio.nextInt (4);
    // a linha abaixo fez o sorteio do indice das faces das cartas, usando objeto sorteio e atribui o resultado a variável indice_face
    // o .lenght gera números aleatórios no intervalo do tamanho total do array
    int  indice_face = sorteio.nextInt(face.length);
    // as linhas abaixo atribuem o resultado do sorteio o array correspondente
    String face = faces(indice_face);
    String nipe = nipes(indice_nipe);
    // a linha abaixo exibe a carta sorteada
    System.out.println(face + " de " + nipe);
            
    
    }    
}