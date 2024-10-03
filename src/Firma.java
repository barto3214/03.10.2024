import java.util.ArrayList;

public class Firma {
    private ArrayList<Pracownik> pracownicyFirmy;

    public Firma(ArrayList<Pracownik> pracownicy) {
        pracownicyFirmy = new ArrayList<>();;
    }

    public Firma() {

    }

    public void dodajPracownika(Pracownik pracownik){
        pracownicyFirmy.add(pracownik);
    }

    public double ileWyplaty(){
        double koszt = 0;
        for (int i = 0; i < pracownicyFirmy.size() ; i++) {
            koszt = koszt +pracownicyFirmy.get(i).getWyplata();
        }
        return koszt;
    }
}