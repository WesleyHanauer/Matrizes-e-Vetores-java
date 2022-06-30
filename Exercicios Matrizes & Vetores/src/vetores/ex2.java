/*Declarar um vetor de até 100 números inteiros positivos,
pedir para o usuário digitar elementos para o vetor,
até que ele digite um 0 ou que o vetor esteja cheio,
que encerra a leitura. Mostrar o vetor lido.*/

package vetores;
import java.util.*;

public class ex2 {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int quantDados =100;
        int[] vetor = new int[quantDados];
        int cont=1;
        for(int i = 0; i< quantDados; i++){
            System.out.println("Informe um dado para a posicao "+cont+" do vetor (0 para parar).");
            vetor[i]=ler.nextInt();
            cont++;
            if (vetor[i]==0){
                quantDados = quantDados -1;
                for(int u = 0; u< quantDados; u++){
                    System.out.print(vetor[u]+" ");
                }
                break;
            }
            quantDados =cont;
            if(quantDados ==101){
                quantDados = quantDados -1;
                for(int u = 0; u< quantDados; u++){
                    System.out.print(vetor[u]+" ");
                }
                break;
            }
        }
    }
}
