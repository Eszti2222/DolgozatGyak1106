package Controller;

import Model.ModelKincsesAjto;
import View.GuiNezet;

public class GuiVezerlo {

    private ModelKincsesAjto modell;
    private GuiNezet nezet;

    public GuiVezerlo(ModelKincsesAjto modell, GuiNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        start();
    }

    private void start() {
        nezet.reset(); // GUI visszaállítása
        modell.ujJatek(); // új nyeremény elhelyezése

        int valasztottAjto = nezet.bekeres();
        modell.valasztas(valasztottAjto);

        nezet.megjelenit("A gép kinyitott egy ajtót...");
        nezet.megjelenit("Nyitott ajtó: " + modell.getNyitottAjto());

        boolean valtott = nezet.dontes();
        int vegsoValasztas = valtott ? modell.getMasikAjto() : modell.getValasztottAjto();

        boolean nyert = modell.ellenoriz(vegsoValasztas);
        nezet.megjelenit(nyert ? "Gratulálok, nyertél!" : "Sajnálom, nem nyertél.");
    }
}