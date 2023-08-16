import java.util.Objects;

public class Angajat extends Persoana{
    public Angajat(String nume, String prenume, String adresa, String email) {
        super(nume, prenume, adresa, email);
    }
    private int Salariu;
    private int Vechime;

    public Angajat(String nume, String prenume, String adresa, String email, int salariu, int vechime) {
        super(nume, prenume, adresa, email);
        Salariu = salariu;
        Vechime = vechime;
    }

    public int getSalariu() {
        return Salariu;
    }

    public void setSalariu(int salariu) {
        Salariu = salariu;
    }

    public int getVechime() {
        return Vechime;
    }

    public void setVechime(int vechime) {
        Vechime = vechime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Angajat angajat)) return false;
        if (!super.equals(o)) return false;
        return getSalariu() == angajat.getSalariu() && getVechime() == angajat.getVechime();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSalariu(), getVechime());
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "Salariu=" + Salariu +
                ", Vechime=" + Vechime +
                "ani}";
    }
}
