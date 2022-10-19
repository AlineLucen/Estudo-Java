package aulas.correcao;

import java.util.Locale;
import java.util.Scanner;
//1) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas: (switch-case)
//
//1 – Adição
//2 – Subtração
//3 – Multiplicação
//4 – Divisão
public class exercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // caso queira ler double com ponto

        System.out.println("selecione uma opção (1 a 4)");
        System.out.println("1 – Adição");
        System.out.println(" 2 –Subtração");
        System.out.println(" 3–Multiplicação");
        System.out.println(" 3–Divisão");
        int operacao = entrada.nextInt();


        System.out.println("Digite um número");
        double n1 = entrada.nextDouble();
        System.out.println("Digite um  segundo número");
       double n2 = entrada.nextDouble();



        switch (operacao){
        case  1 ->{
            double soma = n1+n2;
            System.out.println( soma);
        }
        case 2-> {
            double subtracao = n1-n2;
            System.out.println( subtracao);
        }
        case 3->{
            double multiplicacao =n1*n2;
            System.out.println( multiplicacao);
        }
        case 4->{
            double divisao = n1/n2;
            System.out.println( divisao);
        }
    }

}}
