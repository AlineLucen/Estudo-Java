package aulas.poo;

import java.time.LocalDate;
// Encapsulamento =>
// Escolhe quais atributos/métodos serão visiveis fora da class
// public (padrão) => visivel para todos
// pivrate => os métodos/atributos são viseveis apenas na classe
// protected => bem parecido com o private


public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente( 1,"Ana","Clara", LocalDate.of(2010,3,22), 1.85,65.0);

        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getSobrenome());
        System.out.println(cliente1.getNomeCompleto());
         cliente1.setAltura(50);
         cliente1.setAltura(1.5);
    }


}
