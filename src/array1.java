/**
 * Estudo do array exemplo 1 - exemplo simples
 * @author ettore
 */
public class array1 {
    public static void main(String[]args) {
        //sem array
        System.out.println("Array simples");
        System.out.println("1. Sem array");
        String time1="Palmeiras";
        String time2="Corinthians";
        String time3="São Paulo";
        String time4="Santos";
        System.out.println("time: " + time2);
        System.out.println("1. Com array");
        // a linha abaixo cria um array simples de tamanho 4
        String[] times = ("palmeiras", "Corinthians", "São Paulo", "Santos");
        // a linha abaixo exibe o conteúdo do array na posição [1]
        // [0] [1] [2] [3]
        System.out.println("Time: " + times[1]);
        // na linha abaixo o .lenght exibe o tamanho do array
        System.out.println("tamanho do array: " + times.length);
        // a linha abaixo altera 
        
    }
    
}
