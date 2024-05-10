import java.util.Scanner;

public class Contador extends Exception{
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.print("Informe o segundo numero: ");
        int num2 = sc.nextInt();
        try {
            boolean verificarParametros = verificarParametros(num1, num2);


            //Para melhorar a otimização do sistema e diminuir uso de recurso de hardware
            //dentro do laço for, no indice i, para iniciar a segunda interação, seu valor
            // sera incrementado pela diferenca entre num1 e num2. Isso fara com que a
            // repetição ocorra apenas uma vez independentemente dos parâmetros usados.

            for (int i = num1 ; i <= num2 ; i = i + (num2 - num1)) {
                if (i == num1) {
                    System.out.println("Imprimindo o numero " + num1);
                }else if(i == num2) {
                    System.out.println("Imprimindo o numero " + num2);
                }
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");;
        }
    }

    static Boolean verificarParametros (int num1, int num2) throws ParametrosInvalidosException {
        if (num1 > num2)
            throw new ParametrosInvalidosException();
        return true;
    }

}

