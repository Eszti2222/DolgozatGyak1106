package Model;

public class Ajto {

    private boolean nyeremeny;

    public Ajto(boolean nyeremeny) {
        this.nyeremeny = nyeremeny;
    }

    public boolean isnyeremeny() {
        return nyeremeny;
    }

    public void nyeremenyetElhelyez() {
        nyeremeny = true;
    }
}
