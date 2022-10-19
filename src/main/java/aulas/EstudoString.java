package aulas;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class EstudoString {
    public static void main(String[] args) {
       // Strings são cadeias de caracteres
       // "José" -> j=0,o=1.s=2,é=3

       String nome = "pedro";

       if(nome == "pedro"){ // compara o endereço
            System.out.println("São iguais");
       }
        System.out.print("Digite o seu sobrenome :");
        Scanner entrada = new Scanner(System.in);
        String sobrenome = entrada.nextLine();

        if(sobrenome.equals("pereira")){// aqui compara o conteúdo das strings
            System.out.println("São iguais");
        } else  {
            System.out.println("são diferentes");
        }

       //sobrenome.equalsIgnoreCase("PEREIRA"); // ignora maiusculo e minusculo

        // Outros métodos
        String java = "java";
        String ja = java.substring(0,2);
        String va =java.substring(2);

        String n1 = "Hello";
        String n2 = "World";
        String n3 = n1.concat(n2); // n1+n2

        System.out.println(java.length());// quantos caracteres ela possui
        System.out.println(java.isEmpty()); // verifica se está vazia =>
        System.out.println(java.toLowerCase()); // JACA EM CAIXA ALTA
        System.out.println(java.toLowerCase()); // java em caixa baixa

        String  data = "10/10/2022";
        String[]valores = data.split("/");// só pega os números
        System.out.println(valores[0]);

        String email ="alineadslucena@gmail.com";
        String[] ValoresEmail= email.split("@");
        System.out.println(Arrays.toString(ValoresEmail));
        String nome2 = "José Souza";
        String[] nomesSeparado = nome2.split(" ");
        System.out.println(nomesSeparado[0]);

        String teste = "Amanhã é sexta-feira!";
        String[] teste2 = teste.split("");
        System.out.println(teste2);
        System.out.println(Arrays.toString(teste2));

    }
}
