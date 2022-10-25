package Sacolao;

public class Principal {
    public static void main(String [] args) {
        Fruta uva = new Fruta();
        uva.nome = "uva";
        Fruta melancia = new Fruta();
        melancia.nome = "melancia";
        Fruta banana = new Fruta();
        banana.nome = "banana";

        Sacolao sac = new Sacolao();
        sac.nome = "Sacolao.Sacolao do tio ze";
        sac.adicionaFruta(uva);
        sac.adicionaFruta(melancia);
        sac.adicionaFruta(banana);

        int qtdeFrutas = sac.getQuantidadeFruta();

        System.out.println("A lista do sacolao " + sac.nome + " possui " + qtdeFrutas + " itens");
    }
}
