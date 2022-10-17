/*Ler um vetor X de 10 elementos.
A seguir copiar todos os valores negativos
do vetor X para um vetor R, sem deixar
elementos vazios entre os valores copiados.
Escrever o vetor X e o vetor R.*/

package vetores;
import java.util.*;

public class ex8 {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetorR = new int[10];
        int[] vetorX = new int[10];
        int cont=1;

        for (int i=0;i<vetorR.length;i++){
            System.out.println("Informe um dado para a posicao "+cont+" do vetor.");
            vetorR[i]=ler.nextInt();
            cont++;
        }

        for (int i=0;i<vetorR.length;i++){
            System.out.print(vetorR[i]+" ");
            vetorX[i]=vetorR[i]-vetorR[i]*2;
        }

        System.out.println("");

        for (int i=0;i<vetorR.length;i++){
            System.out.print(vetorX[i]+" ");
        }
    }
}