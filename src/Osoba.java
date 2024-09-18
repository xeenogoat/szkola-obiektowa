import java.util.Scanner;

public class Osoba {
    //hermetyzacja
    //modyfikator dostępu private, protected
    //private widoczne tylko wewnątrz klasy
    private String imie;
    protected String nazwisko;
    private int wiek;

    //przeciążanie kontruktora
    //trzy konstruktory o różnych argumentach
    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        wiek = 7;
    }

    public Osoba() {
        imie = "";
        nazwisko = "";
    }
    //metody dostępowe
    //gettery i settery

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        //zabezpieczenia przed niepozadaną zmianą
        System.out.println("Podaj haslo");
        Scanner klawiatura = new Scanner(System.in);
        String haslo = klawiatura.next();
        if(haslo.equals("qwe123")) {
            this.imie = imie;
        }
        else{
            System.out.println("błędne hasło");
        }
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Osoba " +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ' ';
    }
}