package Exercicio2;

public class Exercicio2 {
    public static void main(String[] args) {

        double altura = 1.72, peso = 82, imc;

        System.out.println("Altura do usuário: " + altura);
        System.out.println("Peso do usuário: " + peso);

        imc = peso / (altura * altura);
        System.out.println("IMC = " + imc);

        if (imc < 18.5) {
            System.out.println(" Classificação = Magreza e Obesidade Grau = 0");
        } else if (imc == 18.5 && imc <= 24.9) {
            System.out.println(" Classificação = Normal e Obesidade Grau = 0");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println(" Classificação = Sobrepeso e Obesidade Grau = I");
        } else if (imc >= 30 && imc <= 39.9) {
            System.out.println(" Classificação = Obesidade e Obesidade Grau = II");
        } else {
            System.out.println(" Classificação = Obesidade Grave e Obesidade Grau = III");
        }

    }
}
