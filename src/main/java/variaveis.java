public class variaveis {
    // Execução do nosso programa JAVA
    public static void main(String[] args){
        System.out.println("Hello,world !"); // equivale ao console.log

        // Variáveis no JAVA
        // fortemente tipado e estaticamente tipado ( vc precisa declarar o tipo e uma vez declarada não muda)

        int idade = 20; //inteiro
        double salario = 4500.99;// dupla precisão
        float nota = 7.5f; //sufixo para float
        long popterra = 7_900_000_000l;
        boolean tarefaConcluida = false; // true ou false
        int i =10 , j= 45, l=1000; // multiplas variáveis
        String nome = "aline";// sempre aspas duplas

        int teste = 10;
        teste = 9; // reatribuição de variaveis

        final int teste2 =200;// impossível mudar o valor

        // operadores

        int a =10;
        int b = 5;

        int soma =a+b; //15
        int subtracao = a-b; //5
        int multiplicacao = a*b; //50
        int divisao = a/b; //2
        System.out.println("o resultado da soma é " + soma);
        //A DIVISÃO DE DOIS INTEIROS RESULT EM INTEIRO

        int n1 = 7;
        int n2 = 2;
        double n3 = 2;
        System.out.println(n1/n2);//3
        System.out.println(n1/n3);//3.5

        //Math

        double x = Math.sqrt(144); //12
        double y = Math.pow(5,2); //25

        System.out.println(Math.PI);

        // casting != converter a vari&aacute;vel ela converte o valor
        int pi2 = (int) Math.PI;

        System.out.println(pi2);

        //Operadores 2

        int valor = 5;
        valor++; //incrementar +1
        valor--; // decrementar-1
        valor +=10; // valor = valor +10;

        // Operadores relacionados

        boolean teste1 = 5 > 1; //true
        boolean teste3 = 5 < 1; //false
        boolean teste4 = 5 == 1; //true
        boolean teste5 = 5 !=1; //false
        boolean teste6 = 6 >= 6; // true
        boolean teste7 = 5<=9; // true

        // Operadores Lógicos
        boolean teste8 = true && false; // false
        boolean teste9 = true || false; // true
        boolean teste10 = (5>10)&&(10<5);//false
        boolean teste11 = (10 >=0) || (1 < 5); //false
        boolean teste12 = (5>1); //true
        boolean teste13 = !teste12; // false
    }
}
