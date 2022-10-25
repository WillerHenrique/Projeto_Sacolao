package br.com.pizzaria.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nome;
    private Float valor;
    private String tamanho;
    private String possuiBordaRecheada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getPossuiBordaRecheada() {
        return possuiBordaRecheada;
    }

    public void setPossuiBordaRecheada(String possuiBordaRecheada) {
        this.possuiBordaRecheada = possuiBordaRecheada;
    }
    List listaIngredientes = new ArrayList<Ingrediente>();
}
