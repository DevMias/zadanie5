import java.util.TreeMap;

public class Main {
    static TreeMap<NrTelefoniczny,Wpis> drzewoMapa = new TreeMap<>();

    public static void main(String[] args) {
        drzewoMapa.put(new NrTelefoniczny("(285)","475-7084"),new Osoba("Johnny","Bravo",new Adres("Kartonowa","12",new NrTelefoniczny("(285)","475-7084"))));
        drzewoMapa.put(new NrTelefoniczny("(275)","245-0277"),new Osoba("Anita","Włodarczyk",new Adres("Biutowa","212",new NrTelefoniczny("(275)","245-0277"))));
        drzewoMapa.put(new NrTelefoniczny("(479)","370-7409"),new Osoba("Seweryn","Krajewski",new Adres("Złota","78",new NrTelefoniczny("(479)","370-7409"))));
        drzewoMapa.put(new NrTelefoniczny("(208)","643-9102"),new Firma("Januszex",new Adres("Biznesowa","2/4",new NrTelefoniczny("(208)","643-9102"))));
        for (Wpis pis:drzewoMapa.values()){
            System.out.println(pis.opis());
        }
    }
}
//for (NrTelefoniczny nr : drzewo.keys()) {
//        if nr in tablica_jest:
//        dodaj_do tablica_usun
//        w przeciwnym:
//        dodaj_do tablica_jest
//        }
//        for nr in tablica_usun:
//        usun nr