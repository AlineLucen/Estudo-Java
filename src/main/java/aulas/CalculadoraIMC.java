package aulas;

import java.util.Scanner;
public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu nome ?");
        String nome = entrada.nextLine();

        System.out.println("Qual a sua idade?");
        int idade = entrada.nextInt();

        System.out.println("Qual a sua altura?");
        double altura = entrada.nextDouble();

        System.out.println("Qual o seu peso?");
        double peso = entrada.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos! " );

        System.out.printf("Este é o seu IMC = %.2f \n", imc);
        System.out.printf("Olá meu nome é %s e tenho %d anos e meu IMC é", nome, idade);


        if (imc < 17) {
            System.out.println("Muito abaixo do peso");
        } else if (imc >= 17 && imc <= 18.49) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Acima do peso");
        } else if (imc >= 30 && imc <= 34.99) {
            System.out.println("Obesidade 1");
        } else if (imc >= 35 && imc <= 39.99) {
            System.out.println("Obesidade II (severa)");
        } else if (imc > 40) {
            System.out.println("Obesidade III (mórbida)");
        }
       // Switch-case

        System.out.println("selecione uma dieta (1 a 3)");
        System.out.println("1-Agua");
        System.out.println("2-Fruta");
        System.out.println("3-Batata");

        int dieta = entrada.nextInt();

        switch (dieta){
            case 1 :
            System.out.println("você escolheu a dieta da água");
            break; //impedir de testar as condições abaixo

            case 2 :
                System.out.println("você escolheu a dieta da fruta");
                break; //impedir de testar as condições abaixo

            case 3 :
                System.out.println("você escolheu a dieta da batata");
                break; //impedir de testar as condições abaixo
            default: // "else"
                System.out.println("Essa dieta não existe");
        }

        System.out.println("Você tem quantos elementos preferidos?");
        int totalAlimentos = entrada.nextInt();

        for (int i =0; i< totalAlimentos; i++){

            System.out.println(i);
        }
        int i =0;
        while(i < totalAlimentos){

            System.out.println(i);
            i++;
        }

    }





}
