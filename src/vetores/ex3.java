/*Ler um vetor de números,de 10 elementos.
Declarar outro vetor inverso, copiar todos os elementos
de números de trás para frente para o vetor inverso.
 */

package vetores;
import java.util.*;

public class ex3 {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetor = new int[10];
        int cont = 1;
        for (int i=0;i<10;i++){
            System.out.println("Informe um valor para a posicao "+cont+" do vetor.");
            vetor[i]=ler.nextInt();
            cont++;
        }
        System.out.println("Vetor normal:");
        for (int i=0;i<10;i++){
            System.out.print(+vetor[i]+" ");
        }
        System.out.println("");
        System.out.println("Vetor invertido:");
        for (int i=9;i>=0;i--){
            System.out.print(+vetor[i]+" ");
        }
    }
}