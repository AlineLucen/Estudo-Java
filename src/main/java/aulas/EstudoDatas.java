package aulas;

import java.time.LocalDate;

public class EstudoDatas {
    public static void main(String[] args) {
        // dia- mês -ano
         // LocalDate armazena qualquer data (dia,mês,ano)
        LocalDate hoje= LocalDate.now(); // pega a data atual
        System.out.println(hoje);

        LocalDate natal = LocalDate.of(2022,12,25);
        System.out.println(natal);

        System.out.println(hoje.isAfter(natal));// verifica se a data é depois da especifica
        System.out.println(hoje.isBefore(natal));// verifica se a data é antes da especifica

        int ano = hoje.getYear(); // o ano da data
        int mes = hoje.getMonthValue(); // o número do mês
        int dia = hoje.getDayOfMonth(); // o número do dia do mês

        int diasParaNatal =natal.getDayOfYear() - hoje.getDayOfYear();// suntrai o dia de natal pelo dia de hoje


        System.out.println(ano);
        System.out.println(mes);
        System.out.println(dia);

        System.out.println("faltam " + diasParaNatal + " dias para o natal");
    }
}
