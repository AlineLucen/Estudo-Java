package aulas.poo;

import java.sql.SQLOutput;

// sub-classe/classe filha
public class Cachorro extends Pet{
    private String comidaFavorita;
    private String raca;

   public Cachorro ( String nome, int idade, double peso,String comidaFavorita,String raca){
       // Representa a classe Pet
       super(nome, idade, peso);// chamando o construtor da classe pai/superclasse
       this.comidaFavorita = comidaFavorita;
       this.raca = raca;
   }
    @Override// vamos subrescrever a ação fazer som
    public void fazerSom(){
        System.out.println("Au uuuuuuu");
    }
    @Override
    public void brincar(){
        this.fazerSom();// chama o fazerSom do cachorro foi sobrescrito
        super.brincar();// esta chamando o brincar() do Pet
        this.dormir();// chama o dormir do pet, pois não foi subscrito
    }
    @Override

    public void comer(String comida){
       // verifica se á comida é a comida favorita
        if(comida.equals(this.comidaFavorita)){
            super.comer(comida);

        } else {
            System.out.println("Quero " + comida + " não");
        }


    }

    public static void main(String[] args) {
        // testar a herança
        Pet pet1 = new Pet("Lunna",3,8.5);
        pet1.dormir();
        pet1.comer("peixe");
        pet1.fazerSom();
        System.out.println("=================");

        Cachorro batata = new Cachorro("rex",5,25.0,"osso","caramelo");
        batata.dormir();
        batata.fazerSom();
        batata.comer("osso");
        batata.setPeso(20);
        batata.brincar();
        batata.comer("feijão");

    }
}
