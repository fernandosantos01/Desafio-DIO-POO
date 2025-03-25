import br.com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Curso 01", "Descricao Curso 01", 45);
        Mentoria mentoria = new Mentoria("Mentoria 01", "Descrição Mentoria 01");
        System.out.println(curso);
        System.out.println(mentoria);
        Dev dev = new Dev("Daniel", curso, );
        BootCamp bootCamp = new BootCamp("DIO CLARO", "POO", );
    }
}