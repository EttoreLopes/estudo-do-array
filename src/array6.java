

/**
 *Estudo do array - exemplo 6 - array Multidimensional
 * @author ettore.lsilva
 */
public class array6 {
    public static void main(String[] args) {
        // a linha abaixo cria um array de duas dimensões com 3 linhas e 3 colunas
        String[][] agenda = (("Bill","1111-1111","bill@outlook.com"),("Linus","2222-2222","linus@tux.com"),("steve","3333-3333","steve@icloud.com"));
        //exemplo 1: recuperando o email o bill
        //System.out.println(agenda[0][2]);
        //exemplo 2: montando agenda de contatos
        //o primeiro laço percorre as linhas
        for (int i = 0; i < agenda.length; i++)
        System.out.println("_________________");
        // o segundo laço dentro do primeiro laço, percorre as colunas, montando a agenda
       
        
    
}
