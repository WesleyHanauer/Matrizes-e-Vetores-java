/*Ler dois vetores, A e B com um número variável
de conteúdo (números) (no máximo 10).
O programa deve solicitar antes da leitura dos vetores
a quantidade de dados a serem lidos (1 a 10),
os dois vetores terão o mesmo número de elementos.
Gerar um terceiro vetor chamado Soma (de no máximo 10 elementos)
que seja a soma dos dados do vetor A com os do vetor B. */

package vetores;
import java.util.*;

public class ex1 {

    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Quantos dados serao lidos nos vetores?");

        int quantDados=ler.nextInt();

        int[] vetor1 = new int[quantDados];
        int[] vetor2 = new int[quantDados];
        int[] vetor3 = new int[quantDados];
        int cont=1;
        for (int i=0;i<quantDados;i++){
            System.out.println("Informe um dado para a posicao "+cont+" do vetor 1.");
            vetor1[i]=ler.nextInt();
            cont++;
        }
        cont=1;
        for (int i=0;i<quantDados;i++){
            System.out.println("Informe um dado para a posicao "+cont+" do vetor 2.");
            vetor2[i]=ler.nextInt();
            cont++;
        }
        for (int i=0;i<quantDados;i++){
            vetor3[i]=vetor1[i]+vetor2[i];
            System.out.println(vetor3[i]);
        }

    }
















}
