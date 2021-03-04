package Calculadora;

import java.util.Scanner;

public class Calculadora {

    static Scanner scanner = new Scanner(System.in);

    Metodos calculaMetodos = new Metodos();
    
    public static void main(String[] args){ 

        int opcao=0;

        do {
            verMenu();
            
            opcao = scanner.nextInt();

            verOpcao(opcao);
            Opcoes(opcao);
            
        } while (opcao != 0);

        scanner.close();

    }

    public static void verMenu() {
        System.out.println(" ----- CALCULADORA DE 4 OPERAÇÕES -----");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("------ Para sair digite 0 ------ \n");
        System.out.print("Escolha uma das opções: ");
    }

    private static void Opcoes(int opcao) {

        switch(opcao) {
            case 1: 
                Soma();
                break;

            case 2:
                Sub();
                break;

            case 3:
                Mult();
                break;

            case 4:
                Div();
                break;
                
            case 0:
                System.out.print("\nSaiu da calculadora. \n");
                System.exit(1);
                break;            

            default:
            
        }

    }

    private static void Soma() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduza o primeiro número: ");
        int a = scanner.nextInt();
        System.out.print("Introduza o segundo número: \n");
        int b = scanner.nextInt();
        System.out.print("\nO resultado da sua soma de " + a + " + " + b + " é = " + Metodos.sum(a, b) + "\n \n");
    }

    private static void Sub() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduza o primeiro número: ");
        int a = scanner.nextInt();
        System.out.print("Introduza o segundo número: \n");
        int b = scanner.nextInt();
        System.out.print("O resultado da sua subtração de " + a + " - " + b +  " é = " + Metodos.sub(a, b) + "\n \n");
    }

    private static void Mult() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduza o primeiro número: ");
        int a = scanner.nextInt();
        System.out.print("Introduza o segundo número: \n");
        int b = scanner.nextInt();
        System.out.print("O resultado da sua multiplicação de " + a + " x " + b + " é = " + Metodos.mult(a, b) + "\n \n");
    }

    private static void Div() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduza o primeiro número: ");
        int a = scanner.nextInt();
        System.out.print("Introduza o segundo número: \n");
        int b = scanner.nextInt();
        System.out.print("O resultado da sua divisão de" + a + " / " + b +  " é = " + Metodos.div(a, b) + "\n \n");
    }

    private static void verOpcao(int opcao) {
        if( opcao < 0|| opcao > 4 ) {
            System.out.println("\nOperação desconhecida. Selecione uma operação entre 1 e 4. Ou, para sair, digite 0.\n");
        }
    }
}
