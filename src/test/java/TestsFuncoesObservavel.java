import InformaString.Notificador.Observavel;
import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class TestsFuncoesObservavel {

    Observavel ob;
    @Before
    public void setup(){
        ob = new Observavel("Stri_g A seR usADA DE tEste");
    }

    @Test
    public void testeRetornaStringComSlicing(){
        String[] str = new String[]{"Stri_g","A","seR","usADA", "DE", "tEste"};
        for(int i = 0; i < str.length; i++)
            assertEquals(ob.getPalavrasCortada()[i], str[i]);
    }

    @Test
    public void testContaNumeroDePalavrasComNumeroDeCaracteresPares(){
        assertEquals(ob.quantidadeParDeCaracter(), 2);
    }
    @Test
    public void testContaNumeroDePalavrasQueComecamComLetraMaiuscula(){
        assertEquals(ob.comecaComLetraMaiuscula(),3);
    }
    @Test
    public void testModificaPalavra(){
        ob.modificaPalavra("Eu sou uma nova String");
        String[] str = new String[]{"Eu", "sou", "uma", "nova", "String"};
        for(int i = 0; i < str.length; i++)
            assertEquals(ob.getPalavrasCortada()[i],str[i]);
    }
}
