import java.util.Objects;

public class Persoana {
    private String Nume;
    private String codNumericPersonal;

    public Persoana(String nume, String codNumericPersonal) {
        Nume = nume;
        this.codNumericPersonal = codNumericPersonal;
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public String getCodNumericPersonal() {
        return codNumericPersonal;
    }

    public void setCodNumericPersonal(String codNumericPersonal) {
        this.codNumericPersonal = codNumericPersonal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persoana persoana)) return false;
        return Objects.equals(getNume(), persoana.getNume()) && Objects.equals(getCodNumericPersonal(), persoana.getCodNumericPersonal());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNume(), getCodNumericPersonal());
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "Nume='" + Nume + '\'' +
                ", codNumericPersonal='" + codNumericPersonal + '\'' +
                '}';
    }
}
//