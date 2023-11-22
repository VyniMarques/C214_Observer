package InformaString.Notificador;

import InformaString.Interfaces.iObservador;

public class Observador implements iObservador {
    String nome;

    public Observador(String nome){
        this.nome = nome;
    }
    @Override
    public void update(Observavel palavras) {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Nome do observador: " + nome);
        System.out.println("Numero de palavras: " + palavras.quantidadeDePalavras());
        System.out.println("Numero de palavras com numero de caracteres par: " + palavras.quantidadeParDeCaracter());
        System.out.println("Numero de palavras iniciadas com letra maiúscula: " + palavras.comecaComLetraMaiuscula());
        System.out.println("-------------------------------------------------------------------------------");
    }
}