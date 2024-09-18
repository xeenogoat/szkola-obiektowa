import java.util.Scanner;

public class Osoba {


}
    public String imię;
    public String nazwisko;
    public int wiek;



    public Osoba(String imię, String nazwisko, int wiek) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImię() {
        System.out.println("Podaj hasło");
        Scanner klawiatura = new Scanner(System.in);
        String haslo = klawiatura.next();
        if (haslo.equals("qwe123")) {
            this.imie = imie;
        } else {
            System.out.println("błędne hasło");
        }


    public void setImię(String imię) {
        this.imię = imię;
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
}

    @Override
    public String toString() {
        return "Osoba{" +
                "imię='" + imię + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
