package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + cargaHoraria;
    }

    @Override
    public String toString() {
        return "\n=======Curso======" +
                "\nTitulo = " + getTitulo() +
                "\nDescricao = " + getDescricao() +
                "\nCarga Horaria = " + cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
}
