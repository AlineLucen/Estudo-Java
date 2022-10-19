package aulas.poo;

public class carro {
    String marca;
    String modelo;
    int ano;
    boolean ehflex;
    int qtdPortas;
    double combustivelAtual;
    double consumo;

    boolean estaLigado;

    carro(String marca,String modelo, int ano, boolean ehflex,int qtdPortas, double consumo){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ehflex = ehflex;
        this.qtdPortas=qtdPortas;
        this.combustivelAtual = 30.00;
        this.consumo=consumo;
        this.estaLigado = false;

    }
    // abastecer
    void abastecer (double total) { //parâmtro do método
        this.combustivelAtual += total;
    }
    // ligar
     void ligar(){
        this.estaLigado = true;
     }
    //viajar
    boolean viajar(String local, double distancia) {
        if (this.estaLigado) {
            this.ligar();

        }

        double totalLitros = distancia / this.consumo;

        if(this.combustivelAtual - totalLitros > 0){
            this.combustivelAtual -= totalLitros;
            System.out.println("A viagem para " + local + " aconteceu. Sobrou " + this.combustivelAtual + " L");
            return true;
        }else {
            System.out.println("A viagem não aconteceu, faltou gasolina");
            return false;
        }
        }
        // a main serve para testar a classe
        public  static void main(String[] args){
          carro carro1 = new carro("ferrari","xy",2019,true,4,40);
        }
}

