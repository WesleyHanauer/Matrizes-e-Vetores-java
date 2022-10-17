/*Ler um vetor que contenha as notas de
uma turma de 10 alunos. Calcular a média
da turma e contar quantos alunos obtiveram
nota acima desta média calculada. Escrever
a média da turma e o resultado da contagem. */

package vetores;
import java.util.*;

public class ex7 {
    public static Scanner ler = new Scanner(System.in);
    public static double media;

    public static void main(String[] args) {
        double[] notas = new double[10];
        int cont=1;
        for(int i=0;i<10;i++){
            System.out.println("Informe a nota do aluno "+cont+":");
            notas[i]=ler.nextDouble();
            cont++;
            }
        int soma = 0;
            for(int i=0;i<10;i++){
                soma+=notas[i];
            }
        double media = soma/10.0;
        System.out.println("Media da turma: "+media);
        int alunosAcima = 0;
        int alunosAbaixo = 0;
        for(int i=0;i<10;i++){
            if (notas[i]>=5.0){
                alunosAcima++;
            }
        }
        System.out.println("Alunos que ficaram acima da media: "+alunosAcima);
    }
}