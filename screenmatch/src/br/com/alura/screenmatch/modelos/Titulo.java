package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.exception.AnoInvalidoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{

    private String nome;
    int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int  totalDeAvaliacoes;
    private int duracaoEmMinutos;


    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmbd) {
        this.nome = meuTituloOmbd.title();
        if (meuTituloOmbd.year().length() > 4){
            throw new AnoInvalidoException("O Ano tem mais de 4 caracteres, não consegui converter o Ano!");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmbd.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmbd.runtime().substring(0,3));
    }

    public void exibirFichaTecnica() {
        System.out.println("Nome do filme: " +nome);
        System.out.println("Ano de lançamento: " +anoDeLancamento);
        System.out.println("Duração em minutos: " +duracaoEmMinutos);
        System.out.println("Incluído no plano: " +incluidoNoPlano);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void avaliar(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double retornarMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "\nTitulo {" +
                "nome: " + nome + '\'' +
                ", anoDeLancamento: " + anoDeLancamento +
                ", duracaoEmMinutos: " + duracaoEmMinutos +
                "}\n";
    }
}
