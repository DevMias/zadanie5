public class NrTelefoniczny implements Comparable<NrTelefoniczny> {
    public String nrKierunkowy,nrTelefonu;

    public NrTelefoniczny(String nrKierunkowy, String nrTelefonu) {
        this.nrKierunkowy = nrKierunkowy;
        this.nrTelefonu = nrTelefonu;
    }

    public String getNrKierunkowy() {
        return nrKierunkowy;
    }

    public void setNrKierunkowy(String nrKierunkowy) {
        this.nrKierunkowy = nrKierunkowy;
    }

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    @Override
    public String toString() {
        return "NrTelefoniczny{" +
                "nrKierunkowy='" + nrKierunkowy + '\'' +
                ", nrTelefonu='" + nrTelefonu + '\'' +
                '}';
    }

    @Override
    public int compareTo(NrTelefoniczny o) {
        if(!o.nrKierunkowy.equals(nrKierunkowy)){
            return nrKierunkowy.compareTo(o.nrKierunkowy);
        }else {
            return nrTelefonu.compareTo(o.nrTelefonu);
        }
    }
}
