package Model;

import java.util.Random;

public class ModelKincsesAjto {

    private Ajto[] ajtok;
    private int valasztottAjto = -1;
    private int nyitottAjto = -1;

    public ModelKincsesAjto() {
        ajtok = new Ajto[3];

        for (int i = 0; i < 3; i++) {
            ajtok[i] = new Ajto(false);
        }

        Random rand = new Random();
        int nyeremenyIndex = rand.nextInt(3);
        ajtok[nyeremenyIndex].nyeremenyetElhelyez();
    }

    public void valasztas(int ajtoIndex) {
        this.valasztottAjto = ajtoIndex;
        nyitottAjto = keresNyithatoAjto();
    }

    private int keresNyithatoAjto() {
        for (int i = 0; i < 3; i++) {
            if (i != valasztottAjto && !ajtok[i].isNyeremeny()) {
                return i;
            }
        }
        return -1;
    }

    public int getNyitottAjto() {
        return nyitottAjto;
    }

    public boolean ellenoriz(int vegsoValasztas) {
        return ajtok[vegsoValasztas].isNyeremeny();
    }
    
    public int getMasikAjto() {
        for (int i = 0; i < 3; i++) {
            if (i != valasztottAjto && i != nyitottAjto) {
                return i;
            }
        }
        return -1;
    }
    
    public int getValasztottAjto() {
        return valasztottAjto;
    }
}