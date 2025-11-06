package Model;

public class ModelKincsesAjto {
    
    private Ajto[] ajtok;
    private int valasztas;
    
     public ModelKincsesAjto() {
        valasztas = -1;
        ajtok = new Ajto[3];
        ajtok[0] = new Ajto(nyeremenyErtek);
        ajtok[1] = new Ajto(true);
        ajtok[2] = new Ajto();
    }
}
