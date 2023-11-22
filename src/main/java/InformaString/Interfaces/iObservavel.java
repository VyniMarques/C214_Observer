package InformaString.Interfaces;

import InformaString.Notificador.Observador;

public interface iObservavel {
    public void registraObservador(Observador obs);
    public void removeObservador(Observador obs);
    public void notificaObservadores();
}
