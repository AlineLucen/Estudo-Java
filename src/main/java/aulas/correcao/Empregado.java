package aulas.correcao;

public class Empregado {
    String nome;
    String sobrenome;
    double salario;

    public Empregado(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }
    double salarioAnual(){

    return this.salario * 12;
    }

    double aumentarSalario(double aumento){
        return this.salario + aumento;
    }

    String nomeCompleto(){
         return this.nome + " " + this.sobrenome;
    }
}

