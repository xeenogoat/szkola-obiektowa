public class Uczen extends Osoba{
    private int nrEwidencyjny;
    public Uczen(String imię, String nazwisko, int wiek) {
        super(imię, nazwisko, wiek);
    }


    public Uczen(String imię, String nazwisko, int wiek, int nrEwidencyjny) {
        super(imię, nazwisko, wiek);
        this.nrEwidencyjny = nrEwidencyjny;
    }
}
