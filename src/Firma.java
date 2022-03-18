public class Firma extends Wpis {
    public String nazwa;
    public Adres adres;

    public Firma(String nazwa, Adres adres) {
        this.nazwa = nazwa;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Firma{" +
                "nazwa='" + nazwa + '\'' +
                ", adres=" + adres.toString() +
                '}';
    }

    @Override
    public String opis() {
        return toString();
    }
}
