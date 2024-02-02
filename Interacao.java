import java.util.Scanner;

public class Interacao {
    public static void main(String[] args) {
        Triangulo PrimeiraInte = new Triangulo();
        Scanner entrada = new Scanner(System.in);

        int lado1, lado2, lado3;
        System.out.println("Informe o primeiro lado do triangulo: " );
        lado1 = entrada.nextInt();

        System.out.println("Informe o primeiro lado do triangulo: " );
        lado2 = entrada.nextInt();

        System.out.println("Informe o primeiro lado do triangulo: " );
        lado3 = entrada.nextInt();

        PrimeiraInte.lado1 = lado1;
        PrimeiraInte.lado2 = lado2;
        PrimeiraInte.lado3 = lado3;

        System.out.println("Os lados digitados foram: " + PrimeiraInte.base);
    }
}
