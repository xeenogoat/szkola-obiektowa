public class Main {
    public static void main(String[] args) {
        Osoba osobaJas = new Osoba("Jaś","Kowalski",12);
        System.out.println("Imie: "+osobaJas.getImie());
        osobaJas.setImie("Jan");
        System.out.println("Imie nowe"+osobaJas.getImie());
        Osoba osobaIsia = new Osoba("Isia","Iksińska");
        Osoba osbaX = new Osoba();
        System.out.println(osobaIsia.getWiek());
        System.out.println(osbaX.getWiek());

        System.out.println(osobaIsia);
        System.out.println("Liczba utworzonych obiektow "+Uczen.liczbaObiektow);
        Uczen uczenEmil = new Uczen("Emil","Smalandzki",7,123);
        System.out.println(uczenEmil);
        System.out.println("Liczba utworzonych obiektow "+Uczen.liczbaObiektow);
        Uczen uczen2 = new Uczen("Jas","Nowak",7);
        System.out.println("Liczba utworzonych obiektow "+Uczen.liczbaObiektow);
        Uczen uczen3 = new Uczen("Asia","Stasia",7);
        System.out.println("Liczba utworzonych obiektow "+Uczen.liczbaObiektow);
        Uczen uczen4 = new Uczen("Basia","Masia",8);
        System.out.println(uczen4);
        System.out.println("Liczba utworzonych obiektow "+Uczen.liczbaObiektow);
    }
}