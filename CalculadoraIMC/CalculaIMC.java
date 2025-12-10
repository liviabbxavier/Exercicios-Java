package CalculadoraIMC;

public class CalculaIMC {
    // fórmula: IMC = peso / altura²
        double p = 65.5;
        double h = 1.63;

        public void calculaImc() {
            double imc = (p / (h * h));
            System.out.println("Seu peso é: " + p);
            System.out.println("Sua altura é: " + h);
            System.out.println("Fazendo o cálculo IMC...");
            System.out.println(String.format("O valor do seu IMC é: %.1f", imc));
        }
}
