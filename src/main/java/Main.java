import InformaString.Notificador.Observador;
import InformaString.Notificador.Observavel;

public class Main {
    public static void main(String[] args) {
        Observavel observavel = new Observavel("Testando A FUNcao agoRa pare");
        Observador observador1 = new Observador("João da Silva");
        Observador observador2 = new Observador("Ana Lucia");
        Observador observador3 = new Observador("José Azevedo");

        observavel.registraObservador(observador1);
        observavel.registraObservador(observador2);
        observavel.notificaObservadores();
        observavel.registraObservador(observador3);
        observavel.removeObservador(observador2);

        observavel.modificaPalavra("Agora teMos uma nova fRASE");

    }
}