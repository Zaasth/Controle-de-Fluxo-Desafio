import java.util.*;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número:");
            int n1 = sc.nextInt();

            System.out.println("Digite o segundo número:");
            int n2 = sc.nextInt();

            contar(n1, n2);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int numero1, int numero2) throws ParametrosInvalidosException{
        int res = (numero1 - numero2);

        if (numero1 < numero2){
            throw new ParametrosInvalidosException();
        } else {
            for (int i = 1; i <= res; i++){
                System.out.println("Imprimindo o número: " + i);
            }
        }


    }
}
