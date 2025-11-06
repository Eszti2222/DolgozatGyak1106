package Model;

public class Ajto {

    private boolean nyeremeny;
    private boolean kivalasztott;
    private boolean nyitott;

    public Ajto(boolean nyeremeny) {
        this.nyeremeny = nyeremeny;
        this.kivalasztott = false;
        this.nyitott = false;
    }

    public boolean isNyeremeny() {
        return nyeremeny;
    }

    public void nyeremenyetElhelyez() {
        nyeremeny = true;
    }

    public boolean isKivalasztott() {
        return kivalasztott;
    }

    public void setKivalasztott(boolean kivalasztott) {
        this.kivalasztott = kivalasztott;
    }

    public boolean isNyitott() {
        return nyitott;
    }

    public void setNyitott(boolean nyitott) {
        this.nyitott = nyitott;
    }
}
