import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException{
        Scanner enter = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = enter.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = enter.nextInt();

        try{
            contar(num1, num2);

        }catch(ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");;
        }
    }
    static void contar(int num1, int num2) throws ParametrosInvalidosException{
        if(num1 > num2){
            throw new ParametrosInvalidosException();
        }else{
            int contagem = num2 - num1;
            for(int i = 0; i <= contagem; i++){
                int numeroAtual = num1 + i;
                System.out.println(numeroAtual);
            }
        }
    }
}
