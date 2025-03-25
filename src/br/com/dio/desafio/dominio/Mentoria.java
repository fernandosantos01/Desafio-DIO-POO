package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria(String titulo, String descricao) {
        super(titulo, descricao);
        this.data = LocalDate.now();
    }


    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "\n=======Mentoria=======" +
                "\nTitulo = " + getTitulo() +
                "\nDescricao = " + getDescricao() +
                "\nData = " + data;
    }

    public LocalDate getData() {
        return data;
    }
}
