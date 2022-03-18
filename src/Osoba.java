public class Osoba extends Wpis {
    public String imie,nazwisko;
    public Adres adres;

    public Osoba(String imie, String nazwisko, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", adres=" + adres.toString() +
                '}';
    }

    @Override
    public String opis() {
        return toString();
    }
}
