package aulas.correcao.pou;


/**
 * Crie uma classe Comida:
 * Atributos: nome, peso;
 * Construtores: Cria a comida com base nos parâmetros nome e peso;
 * Métodos:
 * - getNome()
 * - getPeso()
 */
public class comida {
    private String nome;
    private double peso;

    public comida(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }
}
