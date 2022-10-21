package aulas.poo;

public class Calculadora {
    public static  final double Pi =3.14;
    //final = impede a alteração do valor Pi

    // Método estático
    //não pertence ao objeto, mas sim a classe
    public static double soma(double a,double b) {
        return  a+b;
    }
    public static double subtracao(double a,double b) {
        return  a-b;
    }
    public static double multiplicacao(double a,double b) {
        return  a*b;
    }
    public static double divisao(double a,double b) {
        return  a/b;
    }

  // main = auto -executavel

    public static void main(String[] args) {
        double resultadoSoma = Calculadora.soma(5,7);
        double resultadoSub = Calculadora.subtracao(8,4);
        double resultadoMult = Calculadora.multiplicacao(17,8);
        double resultadoDiv = Calculadora.divisao(12,4);
        System.out.println(Calculadora.Pi);
        System.out.println(Math.pow(4,6));
        System.out.println(Math.PI);
        System.out.println(Math.sqrt(144));
        System.out.println(Math.cbrt(8));
    }
}
