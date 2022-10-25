package Carro;

public class Principal {
    public static void main(String [] args) {

        Carro c1 = new Carro();
        c1.nome = "Palio";
        c1.cor = "Cinza";

        Carro c2 = new Carro();
        c2.nome = "Gol";
        c2.cor = "Preta";

        Agencia ag = new Agencia();
        ag.adicionarCarro(c1);
        ag.adicionarCarro(c2);

        int qtdeCarros = ag.getQuantidadeCarros();

        System.out.println("A lista de carros da agência " + ag.nome + " possui " + qtdeCarros);
    }
}
