package aulas;// Enums são estruturas com constantes definidas
// Dias da semana,Meses do ano,Turnos do dia, estações do ano
//NIveis (júnior,pleno,senior), feriados nacionais, naipes



public class EstudoEnums {
    public static void main(String[] args) {
        enum DiadaSemana{
            segunda,
            terca,
            quarta,
            quinta,
            sexta,
            sabado,
            domingo
        }
        DiadaSemana hoje = DiadaSemana.quinta;
        System.out.println(hoje);

        enum NivelDev{JUNIOR,PLENO,SENIOR}
        NivelDev nivel = NivelDev.PLENO;

        switch (nivel){
            case JUNIOR:
            System.out.println("Seu nível é Junior");
            break;
            case PLENO:
                System.out.println("Seu nível é  Pleno");
                break;
            case SENIOR:
                System.out.println("Seu nível é Sênior ");
                break;


        }

        // VERSÃO ENHANCED
        switch(nivel) {
            case JUNIOR -> {
                System.out.println("Seu nível é JUNIOR");
            }
            case PLENO -> {
                System.out.println("Seu nível é PLENO");
            }
            case SENIOR -> {
                System.out.println("Seu nível é SENIOR");
            }
            default -> {
                System.out.println("Nunca executa");
            }
        }



    }
}
