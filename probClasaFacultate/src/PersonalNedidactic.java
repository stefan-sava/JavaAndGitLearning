import java.util.Objects;

public class PersonalNedidactic extends Angajat{
    public PersonalNedidactic(String nume, String prenume, String adresa, String email, int salariu, int vechime) {
        super(nume, prenume, adresa, email, salariu, vechime);
    }
    private String Functie;

    public PersonalNedidactic(String nume, String prenume, String adresa, String email, int salariu, int vechime, String functie) {
        super(nume, prenume, adresa, email, salariu, vechime);
        Functie = functie;
    }

    public String getFunctie() {
        return Functie;
    }

    public void setFunctie(String functie) {
        Functie = functie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonalNedidactic that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getFunctie(), that.getFunctie());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFunctie());
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "Nume='" + Nume + '\'' +
                ", Prenume='" + Prenume + '\'' +
                ", Adresa='" + Adresa + '\'' +
                ", Email='" + Email + '\'' +
                "} " + "Angajat{" +
                "Salariu=" + Salariu +
                ", Vechime=" + Vechime +
                "ani} " + "PersonalNedidactic{" +
                "Functie='" + Functie + '\'' +
                '}';
    }
}
