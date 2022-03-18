public class Adres {
    public String ulica,numer;
    public NrTelefoniczny nrTelefoniczny;

    public Adres(String ulica, String numer, NrTelefoniczny nrTelefoniczny) {
        this.ulica = ulica;
        this.numer = numer;
        this.nrTelefoniczny = nrTelefoniczny;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNumer() {
        return numer;
    }

    public void setNumer(String numer) {
        this.numer = numer;
    }

    public NrTelefoniczny getNrTelefoniczny() {
        return nrTelefoniczny;
    }

    public void setNrTelefoniczny(NrTelefoniczny nrTelefoniczny) {
        this.nrTelefoniczny = nrTelefoniczny;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "ulica='" + ulica + '\'' +
                ", numer='" + numer + '\'' +
                ", nrTelefoniczny=" + nrTelefoniczny.toString() +
                '}';
    }
}
