import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro parâmetro: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo parâmetro: ");
        int numero2 = scanner.nextInt();
        
        try {
            contar(numero1, numero2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    static void contar(int numero1, int numero2) throws Exception {
        if (numero1 > numero2) {
            throw new Exception("O segundo parâmetro deve ser maior que o primeiro.");
        } else {
            for (int contar = numero1; contar <= numero2; contar++) {
                System.out.println(contar);
            }
            int subtracao = numero2 - numero1;
            System.out.println(" O resultado da subtração é: " + subtracao);
        }
    }
}
