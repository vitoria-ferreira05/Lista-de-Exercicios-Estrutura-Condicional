package Exercicio1;

public class Exercicio1 {
    public static void main(String[] args) {

        int nota1 = 6, nota2 = 5, nota3 = 3, nota4 = 9, media;

        System.out.println("Notas do aluno: ");

        System.out.println("Nota 1:" + nota1);
        System.out.println("Nota 2:" + nota2);
        System.out.println("Nota 3:" + nota3);
        System.out.println("Nota 4:" + nota4);

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.print("O aluno está aprovado!");
        } else {
            System.out.print("O aluno está reprovado!");
        }

    }
}
