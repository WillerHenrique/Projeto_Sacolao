package Sacolao;

import java.util.ArrayList;

public class Sacolao {
    String nome;
    ArrayList<Fruta> listaFrutas = new ArrayList<>();

    public void adicionaFruta(Fruta fruta) {
        listaFrutas.add(fruta);
    }
    public int getQuantidadeFruta() {
        return listaFrutas.size();
    }
}
