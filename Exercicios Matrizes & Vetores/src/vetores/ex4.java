/*Ler um vetor A de 10 elementos inteiros
e um valor X também inteiro.
Armazenar em um vetor M o resultado de cada
elemento de A multiplicado pelo valor X.
Logo após, imprimir o vetor M. */

package vetores;
import java.util.*;

public class ex4 {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int cont=1;
        for (int i=0;i<10;i++){
            System.out.println("Informe um valor para a posicao "+cont+" do vetor.");
            vetor1[i] = ler.nextInt();
            cont++;
        }
        System.out.println("Informe o valor no qual o vetor sera multiplicado: ");
        int multiplicar = ler.nextInt();
        System.out.println("Vetor multiplicado: ");
        for(int i=0;i<10;i++){
            vetor2[i]=vetor1[i]*multiplicar;
            System.out.print(vetor2[i]+" ");
        }
    }
}
