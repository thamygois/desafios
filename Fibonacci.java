import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        // Entrada de dados
            int v1 = 0;
            int v2 = 1;
            int v3 = 0;
            

            System.out.println("Insira um número para cálculo");
            int num = scanner.nextInt();

        while (num > v3){
            v3 = v1 + v2;
            v1 = v2;
            v2 = v3;
        }

        if (num == 0) {
            System.out.println("Número faz parte da sequeência Fibonacci.");
        }

        if (num == 1) {
            System.out.println("Número faz parte da sequeência Fibonacci.");
        }

        if (num == v3) {
            System.out.println("Número faz parte da sequeência Fibonacci.");
        }

        else {
            System.out.println("Número não faz parte da sequeência Fibonacci.");
        }

            scanner.close();
    }
}