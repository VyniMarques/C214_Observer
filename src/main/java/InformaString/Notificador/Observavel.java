package InformaString.Notificador;
import InformaString.Interfaces.iObservavel;

import java.util.ArrayList;
import java.util.List;
public class Observavel implements iObservavel {
    String listaDePalavra;
    private String[] palavrasCortada;
    List<Observador> observadores;

    public Observavel(String listaDePalavra){
        this.listaDePalavra = listaDePalavra;
        separarPalavra();
        observadores = new ArrayList<Observador>();
    }
    public void modificaPalavra(String listaDePalavra){
        this.listaDePalavra = listaDePalavra;
        separarPalavra();
        System.out.println("--A frase foi modificada!!!!--");
        notificaObservadores();
    }
    private void separarPalavra(){
        this.palavrasCortada = listaDePalavra.split("\s");
    }
    public int quantidadeDePalavras(){
        return palavrasCortada.length;
    }
    public int quantidadeParDeCaracter(){
        int cont = 0;
        for(String palavra : palavrasCortada){
            if(palavra.length() % 2 == 0)
                cont++;
        }
        return cont;
    }
    public int comecaComLetraMaiuscula() {
        int cont = 0;
        for (int i = 0; i < palavrasCortada.length; i++) {
            char primeiraLetra = palavrasCortada[i].toCharArray()[0];
            if (Character.isUpperCase(primeiraLetra)) {
                cont++;
            }
        }
        return cont;
    }

    @Override
    public void registraObservador(Observador obs) {
        observadores.add(obs);
    }

    @Override
    public void removeObservador(Observador obs) {
        if(observadores.contains(obs)) {
            observadores.remove(obs);
            System.out.println("--" + obs.nome + " foi remolvido(a) com sucesseso--");
        }
    }

    @Override
    public void notificaObservadores() {
        for (Observador observador : observadores) {
            observador.update(this);
        }
    }

    public String[] getPalavrasCortada() {
        return palavrasCortada;
    }
}
