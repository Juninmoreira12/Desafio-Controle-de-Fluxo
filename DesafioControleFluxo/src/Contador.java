import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicita as entradas do usuário
       
        try{

        System.out.println("Insira o primeiro numero");  

        int numeroUm = Integer.parseInt(scanner.nextLine());

        System.out.println("Insira o segundo numero"); 

        int numeroDois = Integer.parseInt(scanner.nextLine());

        // Verifica se o primeiro número é maior que o segundo
            
            if ( numeroUm > numeroDois){

                throw new ParametrosInvalidosException("O Segundo paramentro deve ser maior que o primeiro");

            }
        // Calcula a quantidade de interações e realiza a impressão

           int interacoes = numeroDois - numeroUm;
            
           for ( int i = 1; i <= interacoes; i++){

                System.out.println("Imprimindo o numero: " + i);
           }
        
            }
        // Tratamento da verificação do primeiro com o segundo numero
        catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            } 

        // Tratamento da inserção de algum dado alem de numeros inteiros.   
        catch (NumberFormatException e) {
                System.out.println("Por favor, insira números inteiros válidos.");
            }

        // Finalização da classe scanner.    
            finally {
                scanner.close();
            }
        
    }

}

