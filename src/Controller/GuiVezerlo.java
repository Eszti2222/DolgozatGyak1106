package Controller;

import Model.ModelKincsesAjto;
import View.GuiNezet;

public class GuiVezerlo {

    private ModelKincsesAjto modell;
    private GuiNezet nezet;


    public GuiVezerlo(ModelKincsesAjto modell, GuiNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;

        nezet.setAjtoValasztasListener(this::ajtoValasztva);
        nezet.setDontesListener(this::dontesKesz);
        nezet.setUjJatekListener(this::ujJatekInditasa);
    }

    private void ajtoValasztva(int ajtoIndex) {
        modell.valasztas(ajtoIndex);
        nezet.frissitAjtok(modell.getAjtok()); 
        nezet.mutatNyitottAjto(modell.getNyitottAjto()); 
        nezet.kerdezDontest(); 
    }


    private void dontesKesz(boolean valtott) {
        int vegsoValasztas = valtott ? modell.getMasikAjto() : modell.getValasztottAjto();
        boolean nyert = modell.ellenoriz(vegsoValasztas);
        nezet.mutatEredmeny(nyert); 
    }

    private void ujJatekInditasa() {
        modell = new ModelKincsesAjto(); 
        nezet.reset(); 
    }
}

}
