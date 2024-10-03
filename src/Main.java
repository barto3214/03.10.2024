public class Main {
    public static void main(String[] args) {
        Firma firma = new Firma();
        Kierownik kierownik = new Kierownik("JAś","Fasola",
                8000,"master");
        Pracownik pracownikAla = new Pracownik("Ala","sdzg",5000,"junior");
        Pracownik pracownikEla = new Pracownik("Ela","sdzg",5000,"junior");
        Pracownik pracownikOla = new Pracownik("Ola","sdzg",15000,"senior");
        kierownik.dodajPracownika(pracownikAla);
        kierownik.dodajPracownika(pracownikEla);


        firma.dodajPracownika(pracownikAla);
        firma.dodajPracownika(pracownikEla);
        firma.dodajPracownika(pracownikOla);
        System.out.println(firma.ileWyplaty());
        System.out.println(pracownikAla);
        pracownikAla.setPodwyzka(30);
        kierownik.dajPodwyzke(50);
        System.out.println(pracownikAla);
        System.out.println(firma.ileWyplaty());
    }
}