import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();
        int count = 0;

        do {
            System.out.println("Numero: " );
            numero = scan.nextInt();
            if (numero %2 == 0)quantPares++;
            else quantImpares++;
            count++;
        }
        while (count < quantNumeros);
        System.out.println("Quantidade de pares: " + quantPares);
        System.out.println("Quantidade de impares: " + quantImpares);

    }

}
