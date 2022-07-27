package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
        private LocalDate data;

    public Mentoria() {
    }

        public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
    }


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulos='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}





