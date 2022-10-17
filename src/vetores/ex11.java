/*Ler um vetor de 10 elementos inteiros.
Após isto, imprimir na tela os 10 valores
lidos e o usuário poderá escolher um destes
valores para ser excluído do vetor. Ler o valor
escolhido e eliminá-lo do vetor. No momento da
exclusão todos os valores posteriores ao valor
escolhido deverão ser reorganizados (movidos uma
posição para esquerda) a fim de que o vetor resultante
não fique com um espaço em branco. Imprimir o novo vetor.*/

package vetores;
import java.util.*;

public class ex11 {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetor = new int[10];
        int cont = 1;
        for (int i=0;i<vetor.length;i++){
            System.out.println("Informe um valor para a posicao "+cont+" do vetor.");
            vetor[i] = ler.nextInt();
            cont++;
        }
        for (int i=0;i<vetor.length;i++){
            System.out.print(vetor[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Escolha um valor para excluir do vetor.");
        int excluir = ler.nextInt();
        for (int i=0;i<10;i++){
            if (vetor[i]!=excluir){
                System.out.print(vetor[i]+" ");
            }
        }
    }
}