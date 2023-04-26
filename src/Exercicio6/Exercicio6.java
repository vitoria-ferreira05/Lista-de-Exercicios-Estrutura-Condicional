package Exercicio6;

public class Exercicio6 {
    public static void main(String[] args) {

        int flamengo = 2, palmeiras = 1;

        System.out.println("FLAMENGO x PALMEIRAS");

        System.out.println("Gols do Flamengo: " + flamengo);
        System.out.println("Gols do Palmeiras: " + palmeiras);

        if (flamengo > palmeiras) {
            System.out.println("Flamengo é vencedor!");
        } else if (palmeiras > flamengo) {
            System.out.println("Palmeiras é vencedor!");
        } else {
            System.out.println("Empate!");
        }
    }
}
