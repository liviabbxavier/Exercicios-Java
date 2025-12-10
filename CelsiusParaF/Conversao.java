package CelsiusParaF;
public class Conversao {
    int celsius = 20;
    double multiplica = 1.8;

    public void cParaF() {
        double f = (celsius * multiplica) + 32;
        int fInt = (int) f; // cast: precisa de uma nova variável. Ex.: double para int
        System.out.println("O valor de °C é: " + celsius);
        System.out.println("Fazendo a conversão para Fahrenheit...");
        System.out.println("Seu resultado é: " + fInt + " °F");
    }
}
