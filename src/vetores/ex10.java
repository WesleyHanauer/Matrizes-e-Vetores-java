/*Ler dois vetores, X e Y de 10
elementos cada um (ocupando as posições de
1 a 10 em cada vetor). Intercalar os elementos
desses dois vetores formando assim um novo
vetor R de 20 elementos, onde nas posições
ímpares de R estejam os elementos de X e
nas posições pares os elementos de Y.
Escrever o vetor R, após sua completa geração.*/

package vetores;
import java.util.*;

public class ex10 {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetorX = new int[10];
        int[] vetorY = new int[10];
        int[] vetorR = new int[20];
        int cont=1;
        for (int i=0;i<10;i++){
            System.out.println("Informe um dado para a posicao "+cont+" do primeiro vetor.");
            vetorX[i]=ler.nextInt();
            cont++;
        }
        cont=1;
        for (int i=0;i<10;i++){
            System.out.println("Informe um dado para a posicao "+cont+" do segundo vetor.");
            vetorY[i]=ler.nextInt();
            cont++;
        }
        int j = 0;
        for (int i=0;i<10;i++){
            vetorR[j]=vetorX[i];
            j++;
            vetorR[j]=vetorY[i];
            j++;
        }
        for (int i=0;i<20;i++){
            System.out.print(vetorR[i]+" ");
        }
    }
}
