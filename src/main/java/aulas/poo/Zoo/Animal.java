package aulas.poo.Zoo;
// Na interface você define um conjunto de métodos (sem corpo)
// E a classe que "herda" deve implementar estes métodos
public interface Animal {
    void dormir();// definição do métod apenas
    void fazerSom();
    void comer(String comida);
}
 class Gato implements Animal{
     @Override
     public void dormir() {
         System.out.println("zzzzzzzz");
     }

     @Override
     public void fazerSom() {
         System.out.println("miau");
     }

     @Override
     public void comer(String comida) {
         if (comida.equals("peixe")){
             System.out.println("Hummm Gosto de peixe");
         }
     }
 }
 class Galinha implements Animal{
     @Override
     public void dormir() {
         System.out.println("zzzz");
     }

     @Override
     public void fazerSom() {
         System.out.println("có có có");
     }
     @Override
     public void comer(String comida) {
         System.out.println("Hummm, có có " + comida);
     }

     public static void main(String[] args) {
         Galinha galinha = new Galinha();
         Gato gato = new Gato();

         galinha.fazerSom();
         galinha.dormir();
         galinha.comer("Milho");

         gato.fazerSom();
         gato.dormir();
         gato.comer("peixe");


         //Interface não consegue criar um objeto
         //Animal novoAnimal = new Animal(); // não consigo criar pois é interface

         Animal animalGalinha = galinha;
         Animal animalGatinho = gato;
         System.out.println("====POLIMORFISMO=====");

         animalGatinho.fazerSom();
         animalGalinha.fazerSom();
     }
 }