/*Ler dois vetores: R de 5 elementos e S
de 10 elementos. Gerar um vetor X de
15 elementos cujas 5 primeiras posições
contenham os elementos de R e as 10 últimas
posições, os elementos de S. Escrever o vetor X.*/

package vetores;
import java.util.*;

public class ex9 {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetorR = new int[5];
        int[] vetorS = new int[10];
        int[] vetorX = new int[15];
        int cont=1;
        for (int i=0;i<vetorR.length;i++){
            System.out.println("Informe um dado para a posicao "+cont+" do primeiro vetor.");
            vetorR[i]=ler.nextInt();
            cont++;
        }
        cont=1;
        for (int i=0;i<vetorS.length;i++){
            System.out.println("Informe um dado para a posicao "+cont+" do segundo vetor.");
            vetorS[i]=ler.nextInt();
            cont++;
        }
        System.arraycopy(vetorR, 0, vetorX, 0, 5);
        System.arraycopy(vetorS, 0, vetorX, 5, 10);
        for (int i=0;i<15;i++){
            System.out.print(vetorX[i]+" ");
        }
    }
}
