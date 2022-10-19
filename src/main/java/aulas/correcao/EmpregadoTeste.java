package aulas.correcao;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Aline","silva",7000);
        System.out.println(empregado1.salarioAnual());
        System.out.println(empregado1.aumentarSalario(500));
        System.out.println(empregado1.nomeCompleto());
    }
}
