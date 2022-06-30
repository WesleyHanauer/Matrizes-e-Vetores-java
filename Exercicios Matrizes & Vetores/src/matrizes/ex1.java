/*Ler 6 números inteiros para preencher uma matriz D 2x3,
ou seja, com 2 linhas e 3 colunas (considere que não
serão informados valores duplicados). A seguir, ler um
número inteiro X e escrever uma mensagem indicando se
o valor de X existe ou não na matriz D. */

package matrizes;
import java.util.*;

public class ex1 {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetor1=new int[3];
        int[] vetor2=new int[3];
        System.out.println("Informe 3 numeros inteiros para a primeira linha: ");
        for(int i=0;i<3;i++){
            vetor1[i]=ler.nextInt();
        }
        System.out.println("Informe 3 numeros inteiros para a segunda linha: ");
        for(int i=0;i<3;i++){
            vetor2[i]=ler.nextInt();
        }
        int[][] matriz={{vetor1[0],vetor1[1],vetor1[2]},{vetor2[0],vetor2[1],vetor2[2]}};
        for (int l=0;l<2;l++){
            System.out.println("");
            for (int c=0;c<3;c++){
                System.out.print(matriz[l][c]+"  ");
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Informe um numero.");
        int verificar=ler.nextInt();
        int existe = 0;
        for(int i=0;i<3;i++){
            if (vetor1[i]==verificar){
                System.out.println("O numero "+verificar+" existe na matriz.");
                existe=1;
            }
        }
        for(int i=0;i<3;i++){
            if (vetor2[i]==verificar){
                System.out.println("O numero "+verificar+" existe na matriz.");
                existe=1;
            }
        }
        if (existe==0){
            System.out.println("O numero "+verificar+" nao existe na matriz.");
        }
    }
}
